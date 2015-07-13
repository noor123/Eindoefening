insert into genre (name) values ("science fiction");
insert into genre (name) values ("adventure");
insert into genre (name) values ("action");
insert into genre (name) values ("commedy");

insert into actor (biography, birthdate, gender, profileImage)
  values ("Jennifer Shrader Lawrence was born on August 15, 1990 in Louisville, Kentucky, to Karen (Koch), who manages a children's camp, and Gary Lawrence, who works in construction. She has two older brothers, Ben and Blaine, and has English, as well as some German, Irish, and Scottish, ancestry.",
          '1990-08-15', 'FEMALE', ?);

insert into movie (title, cast, length, director, summary, image, genres, trailer)
  values ("The hunger games", ?, '142', 'Gary Ross',
  "Katniss Everdeen voluntarily takes her younger sister's place in the Hunger Games, a televised fight to the death in which two teenagers from each of the twelve Districts of Panem are chosen at random to compete.",
  ?, ?, ?);


