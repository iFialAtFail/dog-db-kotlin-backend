-- This file allow to write SQL commands that will be emitted in test and dev.
-- The commands are commented as their support depends of the database
INSERT INTO dog_breed (id, short_description, long_description, image_path)
values ('German Shephard', 'This is a smart puppy.', 'This is a really, really smart puppy.', '/images/german-shephard.jpg');
INSERT INTO dog_breed (id, short_description, long_description, image_path)
values ('Chihuahua', 'All shake and anger.', 'A dog that is all shake and anger and generally unhappy.', '/images/chihuahua.jpg');
