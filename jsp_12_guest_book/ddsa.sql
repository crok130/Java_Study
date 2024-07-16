
drop SCHEMA baskin;
CREATE SCHEMA baskin;
USE baskin;
CREATE TABLE member(
	memberNum INT PRIMARY KEY AUTO_INCREMENT,
	memberId VARCHAR(50) NOT NULL UNIQUE,
    memberPassword VARCHAR(250) NOT NUll,
    memberName VARCHAR(50),
    memberEmail VARCHAR(250)UNIQUE,
    memberGender VARCHAR(5),
    memberaddr VARCHAR(250),
    memberPhone VARCHAR(20)UNIQUE,
    money INT,
    memberType INT -- 관리자 판매 일반 계정 구분
);


CREATE TABLE Books (
    book_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(255) NOT NULL,
    author VARCHAR(100),
    publisher VARCHAR(100),
    price INT NOT NULL,
    description TEXT,
    category VARCHAR(50),
    stock INT NOT NULL,
    seller_id INT NOT NULL,
    bookType INT NOT NULL,
	status INT
);


CREATE TABLE 
Companyboarbbsd(
	titieNum INT PRIMARY KEY AUTO_INCREMENT,
	book_id INT NOT NULL, -- 외래키
	title VARCHAR(250),
    Available int NOT NULL,
    content TEXT,
    FOREIGN KEY (book_id) REFERENCES Books(book_id)
);

CREATE TABLE Orders (
    order_id INT PRIMARY KEY AUTO_INCREMENT,
	memberNum INT NOT NULL,
    guest_name VARCHAR(50),
    guest_email VARCHAR(255),
    guest_phone_number VARCHAR(20),
    total_price DECIMAL(10, 2) NOT NULL,
    order_date DATETIME DEFAULT CURRENT_TIMESTAMP,
    status ENUM('결제 완료', '배송 중', '배송 완료') NOT NULL,
    FOREIGN KEY (memberNum) REFERENCES member(memberNum) ON DELETE CASCADE
);

CREATE TABLE Order_Details (
    detail_id INT PRIMARY KEY AUTO_INCREMENT,
    order_id INT NOT NULL,
    book_id INT NOT NULL,
    quantity INT NOT NULL,
    price INT NOT NULL,
    FOREIGN KEY (order_id) REFERENCES Orders(order_id) ON DELETE CASCADE,
    FOREIGN KEY (book_id) REFERENCES Books(book_id) ON DELETE CASCADE
);

CREATE TABLE Book_Requests (
    request_id INT PRIMARY KEY AUTO_INCREMENT,
    memberNum INT NOT NULL,
    title VARCHAR(255) NOT NULL,
    author VARCHAR(100),
    publisher VARCHAR(100),
    status ENUM('신청', '승인', '거절') DEFAULT '신청',
    FOREIGN KEY (memberNum) REFERENCES member(memberNum) ON DELETE CASCADE
);

CREATE TABLE Used_Books (
    used_book_id INT PRIMARY KEY AUTO_INCREMENT,
    memberNum INT NOT NULL,
    book_id INT NOT NULL,
    publisher VARCHAR(100),
    price INT NOT NULL,
    status ENUM('최상', '상', '중', '하') NOT NULL,
    description TEXT,
    FOREIGN KEY (memberNum) REFERENCES member(memberNum) ON DELETE CASCADE,
    FOREIGN KEY (book_id) REFERENCES Books(book_id) ON DELETE CASCADE
);