insert into genre (name) values ('science fiction'), ('adventure'), ('action'), ('comedy'), ('mystery');

insert into actor (first_name, last_name, birthdate, gender, biography) values
  ('Jennifer', 'Lawrence', '1990-08-15', 'FEMALE', 'Jennifer Shrader Lawrence was born on August 15, 1990 in Louisville, Kentucky, to Karen (Koch), who manages a children''s camp, and Gary Lawrence, who works in construction. She has two older brothers, Ben and Blaine, and has English, as well as some German, Irish, and Scottish, ancestry.'),
  ('Josh', 'Hutcherson', '1992-10-12', 'MALE', 'Joshua Ryan Hutcherson was born on October 12th, 1992 in Union, Kentucky to Michelle Fightmaster Hutcherson, who worked for Delta Air Lines, and Chris Hutcherson, an EPA analyst. He has one younger brother, Connor Hutcherson. From the age of four, Josh knew that he wanted to be an actor. In order to pursue his goal, Josh and his family moved to Los Angeles when he was nine-years-old.'),
  ('Kaya', 'Scodelario', '1992-03-13', 'FEMALE', 'Kaya Scodelario was born in London, England, to a Brazilian mother, Katia (Scodelario), and an English father, Roger Humphrey. Thanks to her mother, she grew up fluent in Brazilian Portuguese as well as English. At the age of 14 Scodelario auditioned for Skins (2007), the debut series for new channel E4 that would become known for casting real teenagers like her, who had no professional acting experience, rather than experienced adult actors. She won the role of "Effy Stonem" and joined the show in January 2007.'),
  ('Shailene', 'Woodley', '1991-11-15', 'FEMALE', 'Actress Shailene Woodley was born in Simi Valley, California, to Lori (Victor), a middle school counselor, and Lonnie Woodley, a school principal. She has one brother, Tanner. She was educated at Simi Valley High School in California. When Woodley was four years old she began commercial modeling. Acting roles followed, and she made her screen debut in 1999''s Replacing Dad (1999). More parts followed in The District (2000), The O.C. (2003) and Crossing Jordan (2001), amongst others. When Woodley was 15, she was diagnosed with Idiopathic Scoliosis and wore a chest-to-hips plastic brace for two years, which proved a successful treatment.');

insert into movie (title, length, director, trailer, summary) values
  ('The hunger games', 133, 'Gary Ross', 'https://www.youtube.com/watch?v=4S9a5V9ODuY', 'Katniss Everdeen voluntarily takes her younger sister''s place in the Hunger Games, a televised fight to the death in which two teenagers from each of the twelve Districts of Panem are chosen at random to compete.'),
  ('The maze runner', 113, 'Wes Ball', 'https://www.youtube.com/watch?v=64-iSYVmMVY', 'Thomas is deposited in a community of boys after his memory is erased, soon learning they''re all trapped in a maze that will require him to join forces with fellow "runners" for a shot at escape.'),
  ('Divergent', 139, 'Neil Burger', 'https://www.youtube.com/watch?v=sutgWjz10sM', 'In a world divided by factions based on virtues, Tris learns she''s Divergent and won''t fit in. When she discovers a plot to destroy Divergents, Tris and the mysterious Four must find out what makes Divergents dangerous before it''s too late.');

insert into movie_genres (movie_id, genres_id) values (1, 1), (1, 3), (2, 1), (2, 3), (2, 5), (3, 1), (3, 3), (3, 5);

insert into movie_cast (movie_id, actor_id, character_name) values
  (1, 1, 'Katniss Everdeen'), (1, 2, 'Peeta Mellark'), (2, 4, 'Tris'), (3, 3, 'Teresa');

insert into user (username, password) values ('noor', '12345'), ('gert', 'wachtwoord'), ('bart', 'aabbcc');

insert into comment (dtype, movie_id, user_id, description, rating) values
  ('comment', 1, 1, 'Great movie, I like it.', null),
  ('review', 3, 1, 'This is a good movie.', 7),
  ('comment', 1, 2, 'Fine to watch.', null),
  ('review', 2, 2, 'The actors are the best', 8),
  ('comment', 2, 3, 'Amazing!', null),
  ('review', 1, 3, 'You should see it.', 7),
  ('comment', 3, 1, 'Nothing to say.', null),
  ('review', 3, 1, 'If you see it, you will know it''s good.', 9),
  ('review', 2, 2, 'It''s... fantasy!', 5),
  ('review', 3, 3, 'Good story.', 10);

insert into user_saved_movies (user_id, saved_movies_id) values (1,2), (1,3), (2,1), (2,3), (3,1), (3,2), (3,3);