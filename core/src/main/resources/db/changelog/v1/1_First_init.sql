CREATE TABLE `trustmeenglish`.`users` (
    `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
    `email` VARCHAR(45) NOT NULL,
    `password` VARCHAR(45) NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE);

INSERT INTO `trustmeenglish`.`users` (`email`, `password`) VALUES ('abc@mail.ru', '12345');