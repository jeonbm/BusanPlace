create database BusanPlace;

use BusanPlace;

CREATE TABLE busanCity(
	seq INT NOT NULL AUTO_INCREMENT,
    gu VARCHAR(4) NOT NULL,
	village VARCHAR(7) NOT NULL,
    PRIMARY KEY(seq)
);

desc busanCity;
INSERT INTO busanCity(gu,village) values("강서구","강동동");
INSERT INTO busanCity(gu,village) values("강서구","구랑동");
INSERT INTO busanCity(gu,village) values("강서구","녹산동");
INSERT INTO busanCity(gu,village) values("강서구","눌차동");
INSERT INTO busanCity(gu,village) values("강서구","대저1동");
INSERT INTO busanCity(gu,village) values("강서구","대저2동");
INSERT INTO busanCity(gu,village) values("강서구","대항동");
INSERT INTO busanCity(gu,village) values("강서구","동선동");
INSERT INTO busanCity(gu,village) values("강서구","명지동");
INSERT INTO busanCity(gu,village) values("강서구","미음동");
INSERT INTO busanCity(gu,village) values("강서구","범방동");
INSERT INTO busanCity(gu,village) values("강서구","봉림동");
INSERT INTO busanCity(gu,village) values("강서구","생곡동");
INSERT INTO busanCity(gu,village) values("강서구","성북동");
INSERT INTO busanCity(gu,village) values("강서구","송정동");
INSERT INTO busanCity(gu,village) values("강서구","식만동");
INSERT INTO busanCity(gu,village) values("강서구","신호동");
INSERT INTO busanCity(gu,village) values("강서구","죽동동");
INSERT INTO busanCity(gu,village) values("강서구","죽림동");
INSERT INTO busanCity(gu,village) values("강서구","지사동");
INSERT INTO busanCity(gu,village) values("강서구","천성동");
INSERT INTO busanCity(gu,village) values("강서구","화전동");

INSERT INTO busanCity(gu,village) values("금정구","구서동");
INSERT INTO busanCity(gu,village) values("금정구","금사동");
INSERT INTO busanCity(gu,village) values("금정구","금성동");
INSERT INTO busanCity(gu,village) values("금정구","남산동");
INSERT INTO busanCity(gu,village) values("금정구","노포동");
INSERT INTO busanCity(gu,village) values("금정구","두구동");
INSERT INTO busanCity(gu,village) values("금정구","부곡동");
INSERT INTO busanCity(gu,village) values("금정구","서동");
INSERT INTO busanCity(gu,village) values("금정구","선동");
INSERT INTO busanCity(gu,village) values("금정구","오륜동");
INSERT INTO busanCity(gu,village) values("금정구","장전동");
INSERT INTO busanCity(gu,village) values("금정구","청룡동");
INSERT INTO busanCity(gu,village) values("금정구","회동동");

INSERT INTO busanCity(gu,village) values("기장군","기장읍");
INSERT INTO busanCity(gu,village) values("기장군","일광면");
INSERT INTO busanCity(gu,village) values("기장군","장안읍");
INSERT INTO busanCity(gu,village) values("기장군","정관읍");
INSERT INTO busanCity(gu,village) values("기장군","철마면");

INSERT INTO busanCity(gu,village) values("남구","감만동");
INSERT INTO busanCity(gu,village) values("남구","대연동");
INSERT INTO busanCity(gu,village) values("남구","문현동");
INSERT INTO busanCity(gu,village) values("남구","용당동");
INSERT INTO busanCity(gu,village) values("남구","용호동");

INSERT INTO busanCity(gu,village) values("동구","범일동");
INSERT INTO busanCity(gu,village) values("동구","수정동");
INSERT INTO busanCity(gu,village) values("동구","좌천동");
INSERT INTO busanCity(gu,village) values("동구","초량동");

INSERT INTO busanCity(gu,village) values("동래구","낙민동");
INSERT INTO busanCity(gu,village) values("동래구","명륜동");
INSERT INTO busanCity(gu,village) values("동래구","명장동");
INSERT INTO busanCity(gu,village) values("동래구","복천동");
INSERT INTO busanCity(gu,village) values("동래구","사직동");
INSERT INTO busanCity(gu,village) values("동래구","수안동");
INSERT INTO busanCity(gu,village) values("동래구","안락동");
INSERT INTO busanCity(gu,village) values("동래구","온천동");
INSERT INTO busanCity(gu,village) values("동래구","칠산동");

INSERT INTO busanCity(gu,village) values("부산진구","가야동");
INSERT INTO busanCity(gu,village) values("부산진구","개금동");
INSERT INTO busanCity(gu,village) values("부산진구","당감동");
INSERT INTO busanCity(gu,village) values("부산진구","범전동");
INSERT INTO busanCity(gu,village) values("부산진구","범천동");
INSERT INTO busanCity(gu,village) values("부산진구","부암동");
INSERT INTO busanCity(gu,village) values("부산진구","부전동");
INSERT INTO busanCity(gu,village) values("부산진구","양정동");
INSERT INTO busanCity(gu,village) values("부산진구","연지동");
INSERT INTO busanCity(gu,village) values("부산진구","전포동");
INSERT INTO busanCity(gu,village) values("부산진구","초읍동");

INSERT INTO busanCity(gu,village) values("북구","구포동");
INSERT INTO busanCity(gu,village) values("북구","금곡동");
INSERT INTO busanCity(gu,village) values("북구","덕천동");
INSERT INTO busanCity(gu,village) values("북구","만덕동");
INSERT INTO busanCity(gu,village) values("북구","화명동");

INSERT INTO busanCity(gu,village) values("사상구","감전동");
INSERT INTO busanCity(gu,village) values("사상구","괘법동");
INSERT INTO busanCity(gu,village) values("사상구","덕포동");
INSERT INTO busanCity(gu,village) values("사상구","모라동");
INSERT INTO busanCity(gu,village) values("사상구","삼락동");
INSERT INTO busanCity(gu,village) values("사상구","엄궁동");
INSERT INTO busanCity(gu,village) values("사상구","주례동");
INSERT INTO busanCity(gu,village) values("사상구","학장동");

INSERT INTO busanCity(gu,village) values("사하구","감천동");
INSERT INTO busanCity(gu,village) values("사하구","괴정동");
INSERT INTO busanCity(gu,village) values("사하구","구평동");
INSERT INTO busanCity(gu,village) values("사하구","다대동");
INSERT INTO busanCity(gu,village) values("사하구","당리동");
INSERT INTO busanCity(gu,village) values("사하구","신평동");
INSERT INTO busanCity(gu,village) values("사하구","장림동");
INSERT INTO busanCity(gu,village) values("사하구","하단동");

INSERT INTO busanCity(gu,village) values("서구","남부민동");
INSERT INTO busanCity(gu,village) values("서구","동대신동1가");
INSERT INTO busanCity(gu,village) values("서구","동대신동2가");
INSERT INTO busanCity(gu,village) values("서구","동대신동3가");
INSERT INTO busanCity(gu,village) values("서구","부민동1가");
INSERT INTO busanCity(gu,village) values("서구","부민동2가");
INSERT INTO busanCity(gu,village) values("서구","부민동3가");
INSERT INTO busanCity(gu,village) values("서구","부용동1가");
INSERT INTO busanCity(gu,village) values("서구","부용동2가");
INSERT INTO busanCity(gu,village) values("서구","서대신동1가");
INSERT INTO busanCity(gu,village) values("서구","서대신동2가");
INSERT INTO busanCity(gu,village) values("서구","서대신동3가");
INSERT INTO busanCity(gu,village) values("서구","아미동1가");
INSERT INTO busanCity(gu,village) values("서구","아미동2가");
INSERT INTO busanCity(gu,village) values("서구","암남동");
INSERT INTO busanCity(gu,village) values("서구","초장동");
INSERT INTO busanCity(gu,village) values("서구","충무동1가");
INSERT INTO busanCity(gu,village) values("서구","충무동2가");
INSERT INTO busanCity(gu,village) values("서구","충무동3가");
INSERT INTO busanCity(gu,village) values("서구","토성동1가");
INSERT INTO busanCity(gu,village) values("서구","토성동2가");
INSERT INTO busanCity(gu,village) values("서구","토성동3가");
INSERT INTO busanCity(gu,village) values("서구","토성동4가");
INSERT INTO busanCity(gu,village) values("서구","토성동5가");

INSERT INTO busanCity(gu,village) values("수영구","광안동");
INSERT INTO busanCity(gu,village) values("수영구","남천동");
INSERT INTO busanCity(gu,village) values("수영구","망미동");
INSERT INTO busanCity(gu,village) values("수영구","민락동");
INSERT INTO busanCity(gu,village) values("수영구","수영동");

INSERT INTO busanCity(gu,village) values("연제구","거제동");
INSERT INTO busanCity(gu,village) values("연제구","연산동");

INSERT INTO busanCity(gu,village) values("영도구","남항동1가");
INSERT INTO busanCity(gu,village) values("영도구","남항동2가");
INSERT INTO busanCity(gu,village) values("영도구","남항동3가");
INSERT INTO busanCity(gu,village) values("영도구","대교동1가");
INSERT INTO busanCity(gu,village) values("영도구","대교동2가");
INSERT INTO busanCity(gu,village) values("영도구","대평동1가");
INSERT INTO busanCity(gu,village) values("영도구","대평동2가");
INSERT INTO busanCity(gu,village) values("영도구","동삼동");
INSERT INTO busanCity(gu,village) values("영도구","봉래동1가");
INSERT INTO busanCity(gu,village) values("영도구","봉래동2가");
INSERT INTO busanCity(gu,village) values("영도구","봉래동3가");
INSERT INTO busanCity(gu,village) values("영도구","봉래동4가");
INSERT INTO busanCity(gu,village) values("영도구","봉래동5가");
INSERT INTO busanCity(gu,village) values("영도구","신선동1가");
INSERT INTO busanCity(gu,village) values("영도구","신선동2가");
INSERT INTO busanCity(gu,village) values("영도구","신선동3가");
INSERT INTO busanCity(gu,village) values("영도구","영선동1가");
INSERT INTO busanCity(gu,village) values("영도구","영선동2가");
INSERT INTO busanCity(gu,village) values("영도구","영선동3가");
INSERT INTO busanCity(gu,village) values("영도구","영선동4가");
INSERT INTO busanCity(gu,village) values("영도구","청학동");

INSERT INTO busanCity(gu,village) values("중구","광복동1가");
INSERT INTO busanCity(gu,village) values("중구","광복동2가");
INSERT INTO busanCity(gu,village) values("중구","광복동3가");
INSERT INTO busanCity(gu,village) values("중구","남포동1가");
INSERT INTO busanCity(gu,village) values("중구","남포동2가");
INSERT INTO busanCity(gu,village) values("중구","남포동3가");
INSERT INTO busanCity(gu,village) values("중구","남포동4가");
INSERT INTO busanCity(gu,village) values("중구","남포동5가");
INSERT INTO busanCity(gu,village) values("중구","남포동6가");
INSERT INTO busanCity(gu,village) values("중구","대창동1가");
INSERT INTO busanCity(gu,village) values("중구","대창동2가");
INSERT INTO busanCity(gu,village) values("중구","대청동1가");
INSERT INTO busanCity(gu,village) values("중구","대청동2가");
INSERT INTO busanCity(gu,village) values("중구","대청동3가");
INSERT INTO busanCity(gu,village) values("중구","대청동4가");
INSERT INTO busanCity(gu,village) values("중구","동광동1가");
INSERT INTO busanCity(gu,village) values("중구","동광동2가");
INSERT INTO busanCity(gu,village) values("중구","동광동3가");
INSERT INTO busanCity(gu,village) values("중구","동광동4가");
INSERT INTO busanCity(gu,village) values("중구","동광동5가");
INSERT INTO busanCity(gu,village) values("중구","보수동1가");
INSERT INTO busanCity(gu,village) values("중구","보수동2가");
INSERT INTO busanCity(gu,village) values("중구","보수동3가");
INSERT INTO busanCity(gu,village) values("중구","부평동1가");
INSERT INTO busanCity(gu,village) values("중구","부평동2가");
INSERT INTO busanCity(gu,village) values("중구","부평동3가");
INSERT INTO busanCity(gu,village) values("중구","부평동4가");
INSERT INTO busanCity(gu,village) values("중구","신창동1가");
INSERT INTO busanCity(gu,village) values("중구","신창동2가");
INSERT INTO busanCity(gu,village) values("중구","신창동3가");
INSERT INTO busanCity(gu,village) values("중구","신창동4가");
INSERT INTO busanCity(gu,village) values("중구","영주동");
INSERT INTO busanCity(gu,village) values("중구","중앙동1가");
INSERT INTO busanCity(gu,village) values("중구","중앙동2가");
INSERT INTO busanCity(gu,village) values("중구","중앙동3가");
INSERT INTO busanCity(gu,village) values("중구","중앙동4가");
INSERT INTO busanCity(gu,village) values("중구","중앙동5가");
INSERT INTO busanCity(gu,village) values("중구","중앙동6가");
INSERT INTO busanCity(gu,village) values("중구","중앙동7가");
INSERT INTO busanCity(gu,village) values("중구","창선동1가");
INSERT INTO busanCity(gu,village) values("중구","창선동2가");

INSERT INTO busanCity(gu,village) values("해운대구","반송동");
INSERT INTO busanCity(gu,village) values("해운대구","반여동");
INSERT INTO busanCity(gu,village) values("해운대구","석대동");
INSERT INTO busanCity(gu,village) values("해운대구","송정동");
INSERT INTO busanCity(gu,village) values("해운대구","우동");
INSERT INTO busanCity(gu,village) values("해운대구","재송동");
INSERT INTO busanCity(gu,village) values("해운대구","좌동");
INSERT INTO busanCity(gu,village) values("해운대구","중동");

select * from busanCity where gu = "중구";