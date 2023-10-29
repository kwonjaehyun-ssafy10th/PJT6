create DATABASE IF NOT EXISTS ssafit;

USE ssafit;

CREATE TABLE IF NOT EXISTS `video` (
  `id` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `youtubeId` varchar(40) NOT NULL UNIQUE,
  `channelName` varchar(40) NOT NULL,
  `title` varchar(40) NOT NULL,
  `fitPartName` varchar(40) NOT NULL,
  `viewCnt` int NOT NULL
 );
 
 INSERT INTO video
	VALUES
	(0, 'asdawdasd', 'THANKYOU', '전신 운동 1', '전신', 0),
	(0, 'asdawqwds', 'THANKYOU', '전신 운동 2', '전신', 0),
    (0, 'asadsasqd', 'AMUGEONA', '복부 운동 1', '복부', 0),
    (0, 'asqdsaasd', 'PEACEMAN', '하체 운동 1', '하체', 0),
    (0, 'asdaqwdsd', 'OURWORLD', '상체 운동 1', '상체', 0);

CREATE TABLE IF NOT EXISTS `review` (
  `reviewId` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `videoId` int NOT NULL,
  `writer` varchar(40) NOT NULL,
  `content` varchar(40) NOT NULL,
  FOREIGN KEY (`videoId`) REFERENCES `video` (`id`)
);
 
 INSERT INTO review
	VALUES
	(0, 1, '이승연', '재미있어요~'),
	(0, 1, '이승연', '화이팅'),
    (0, 2, '이승연', '건강제일'),
    (0, 3, '이승연', '멋있다'),
    (0, 4, '이승연', '몸짱');

CREATE TABLE IF NOT EXISTS `user` (
  `id` varchar(40) NOT NULL unique,
  `password` varchar(40) NOT NULL
);
 
 INSERT INTO user
	VALUES
    ('ssafy', 'ssafy');