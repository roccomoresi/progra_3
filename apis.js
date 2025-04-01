// Importar módulos necesarios
const express = require("express");
const { Sequelize, DataTypes } = require("sequelize");

// Configurar la base de datos SQLite
const sequelize = new Sequelize({
  dialect: "sqlite",
  storage: "database.sqlite",
});

// Definir el modelo Usuario
const Usuario = sequelize.define("Usuario", {
  nombre: { type: DataTypes.STRING, allowNull: false },
  email: { type: DataTypes.STRING, unique: true, allowNull: false },
});

// Sincronizar la base de datos
(async () => {
  await sequelize.sync();
})();

// Inicializar Express
const app = express();
app.use(express.json());

// Rutas CRUD para Usuarios
app.get("/usuarios", async (req, res) => {
  const usuarios = await Usuario.findAll();
  res.json(usuarios);
});

app.post("/usuarios", async (req, res) => {
  try {
    const usuario = await Usuario.create(req.body);
    res.status(201).json(usuario);
  } catch (error) {
    res.status(400).json({ error: error.message });
  }
});

app.put("/usuarios/:id", async (req, res) => {
  const usuario = await Usuario.findByPk(req.params.id);
  if (usuario) {
    await usuario.update(req.body);
    res.json(usuario);
  } else {
    res.status(404).json({ error: "Usuario no encontrado" });
  }
});

app.delete("/usuarios/:id", async (req, res) => {
  const usuario = await Usuario.findByPk(req.params.id);
  if (usuario) {
    await usuario.destroy();
    res.json({ message: "Usuario eliminado" });
  } else {
    res.status(404).json({ error: "Usuario no encontrado" });
  }
});

// Iniciar servidor
const PORT = 3000;
app.listen(PORT, () => {
  console.log(`Servidor corriendo en http://localhost:${PORT}`);
});
