DROP TABLE IF EXISTS tool_recipes;
DROP TABLE IF EXISTS food_recipes;
DROP TABLE IF EXISTS instructions;
DROP TABLE IF EXISTS tools;
DROP TABLE IF EXISTS foods;
DROP TABLE IF EXISTS recipes;


CREATE TABLE IF NOT EXISTS recipes (
  recipe_id serial PRIMARY KEY,
  name VARCHAR(30),
  description VARCHAR(255),
  serves INT,
  UNIQUE (name)
);

CREATE TABLE foods (
  food_id serial PRIMARY KEY,
  name VARCHAR(30),
  quantity_units VARCHAR(30),
  is_liquid BOOLEAN,
  UNIQUE (name)
);

CREATE TABLE IF NOT EXISTS tools (
  tool_id serial PRIMARY KEY,
  name VARCHAR(30),
  UNIQUE (name)
);

CREATE TABLE IF NOT EXISTS instructions (
  recipe_id INT NOT NULL REFERENCES recipes(recipe_id),
  instruction VARCHAR(255),
  step INT,
  UNIQUE (recipe_id,step)
);

CREATE TABLE food_recipes (
  recipe_id INT NOT NULL REFERENCES recipes(recipe_id),
  food_id INT NOT NULL REFERENCES foods(food_id),
  quantity INT,
  UNIQUE (recipe_id,food_id)
);

CREATE TABLE IF NOT EXISTS tool_recipes (
  tool_id INT NOT NULL REFERENCES tools(tool_id),
  recipe_id INT NOT NULL REFERENCES recipes(recipe_id),
  UNIQUE (recipe_id,tool_id)
);
