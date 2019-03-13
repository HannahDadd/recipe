INSERT INTO foods VALUES
  (DEFAULT, 'Advocado', '', false),
  (DEFAULT, 'Bread', 'slices', false),
  (DEFAULT, 'Banana', '', FALSE),
  (DEFAULT, 'Pizza Base', '', FALSE),
  (DEFAULT, 'Tomato Sauce', 'ml', TRUE),
  (DEFAULT, 'Pasta', 'g', FALSE),
  (DEFAULT, 'Cheese', 'g', FALSE);

INSERT INTO tools VALUES
  (DEFAULT, 'Toaster'),
  (DEFAULT, 'Oven'),
  (DEFAULT, 'Saucepan'),
  (DEFAULT, 'Spoon'),
  (DEFAULT, 'Hob');

INSERT INTO recipes VALUES
  (DEFAULT, 'Advocado on Toast', 'A pompsy brunch', 1),
  (DEFAULT, 'Magherritta Pizza', 'A simple magherritta pizza', 1),
  (DEFAULT, 'Banana Bread', 'Some bread and banana', 1),
  (DEFAULT, 'Cheesy Pasta', 'Pasta and Cheese', 1),
  (DEFAULT, 'Tomato Pasta', 'Tomatoey pasta', 1);

INSERT INTO instructions VALUES
  (1, 'Toast bread', 1),
  (1, 'Chop advocado', 2),
  (1, 'Place advocado on toast', 3),
  (2, 'Spread sauce over pizza base', 1),
  (2, 'Put cheese on sauce', 2),
  (2, 'Cook in oven for 20 minutes', 3),
  (3, 'Add Banana to bread', 1),
  (4, 'Boil Pasta on hob', 1),
  (4, 'Stir in cheese with spoon', 2),
  (5, 'Boil Pasta on hob', 1),
  (5, 'Stir in tomato with spoon', 2);

INSERT INTO food_recipes VALUES
  ((SELECT recipe_id FROM recipes WHERE recipes.name = 'Advocado on Toast'), (SELECT food_id FROM foods WHERE foods.name = 'Advocado'), 1),
  ((SELECT recipe_id FROM recipes WHERE recipes.name = 'Advocado on Toast'), (SELECT food_id FROM foods WHERE foods.name = 'Bread'), 1),
  ((SELECT recipe_id FROM recipes WHERE recipes.name = 'Magherritta Pizza'), (SELECT food_id FROM foods WHERE foods.name = 'Pizza Base'), 1),
  ((SELECT recipe_id FROM recipes WHERE recipes.name = 'Magherritta Pizza'), (SELECT food_id FROM foods WHERE foods.name = 'Tomato Sauce'), 20),
  ((SELECT recipe_id FROM recipes WHERE recipes.name = 'Magherritta Pizza'), (SELECT food_id FROM foods WHERE foods.name = 'Cheese'), 30),
  ((SELECT recipe_id FROM recipes WHERE recipes.name = 'Banana Bread'), (SELECT food_id FROM foods WHERE foods.name = 'Bread'), 1),
  ((SELECT recipe_id FROM recipes WHERE recipes.name = 'Banana Bread'), (SELECT food_id FROM foods WHERE foods.name = 'Banana'), 1),
  ((SELECT recipe_id FROM recipes WHERE recipes.name = 'Cheesy Pasta'), (SELECT food_id FROM foods WHERE foods.name = 'Pasta'), 500),
  ((SELECT recipe_id FROM recipes WHERE recipes.name = 'Cheesy Pasta'), (SELECT food_id FROM foods WHERE foods.name = 'Cheese'), 30),
  ((SELECT recipe_id FROM recipes WHERE recipes.name = 'Tomato Pasta'), (SELECT food_id FROM foods WHERE foods.name = 'Tomato Sauce'), 20),
  ((SELECT recipe_id FROM recipes WHERE recipes.name = 'Tomato Pasta'), (SELECT food_id FROM foods WHERE foods.name = 'Pasta'), 500);

INSERT INTO tool_recipes VALUES
  ((SELECT recipe_id FROM recipes WHERE recipes.name = 'Advocado on Toast'), (SELECT tool_id FROM tools WHERE tools.name = 'Toaster')),
  ((SELECT recipe_id FROM recipes WHERE recipes.name = 'Magherritta Pizza'), (SELECT tool_id FROM tools WHERE tools.name = 'Oven')),
  ((SELECT recipe_id FROM recipes WHERE recipes.name = 'Banana Bread'), (SELECT tool_id FROM tools WHERE tools.name = 'Oven')),
  ((SELECT recipe_id FROM recipes WHERE recipes.name = 'Cheesy Pasta'), (SELECT tool_id FROM tools WHERE tools.name = 'Hob')),
  ((SELECT recipe_id FROM recipes WHERE recipes.name = 'Cheesy Pasta'), (SELECT tool_id FROM tools WHERE tools.name = 'Spoon')),
  ((SELECT recipe_id FROM recipes WHERE recipes.name = 'Cheesy Pasta'), (SELECT tool_id FROM tools WHERE tools.name = 'Saucepan')),
  ((SELECT recipe_id FROM recipes WHERE recipes.name = 'Tomato Pasta'), (SELECT tool_id FROM tools WHERE tools.name = 'Hob')),
  ((SELECT recipe_id FROM recipes WHERE recipes.name = 'Tomato Pasta'), (SELECT tool_id FROM tools WHERE tools.name = 'Spoon')),
  ((SELECT recipe_id FROM recipes WHERE recipes.name = 'Tomato Pasta'), (SELECT tool_id FROM tools WHERE tools.name = 'Saucepan'));