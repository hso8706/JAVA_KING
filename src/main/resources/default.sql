-- 1. IT기획부 ~ IT투자금융단 (팀/계 없음)
INSERT INTO organization (department, team, unit, create_at, update_at)
VALUES
    ('IT기획부', '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    ('IT시스템부', '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    ('IT금융부', '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    ('IT디지털플랫폼부', '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    ('IT카드디지털단', '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    ('IT투자금융단', '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

-- 2. IT경영정보부 전체 팀 (unit 없는 팀 포함)
INSERT INTO organization (department, team, unit, create_at, update_at)
VALUES
    ('IT경영정보부', 'IT경영정보전략팀', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    ('IT경영정보부', 'IT마케팅허브팀', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    ('IT경영정보부', 'IT데이터허브팀', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    ('IT경영정보부', 'IT마이데이터팀', '빅데이터계', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    ('IT경영정보부', 'IT마이데이터팀', '마이데이터계', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    ('IT경영정보부', 'IT경영관리팀', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    ('IT경영정보부', 'IT리스크관리팀', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    ('IT경영정보부', 'IT회계정보팀', '연결결산계', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    ('IT경영정보부', 'IT회계정보팀', '금융상품평가계', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    ('IT경영정보부', 'IT회계정보팀', '재무회계계', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);


INSERT INTO member (organization_id, name, id_number, grade, role, status, create_at, update_at)
VALUES (10, '윤원진', '24313333', 'GRADE_M', 'APPROVER', 'UNAVAILABLE', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
       (11, '송하경', '24316666', 'GRADE_4', 'APPROVER', 'AVAILABLE', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
       (16, '하정호', '24310590', 'GRADE_5', 'EMPLOYEE', 'AVAILABLE', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

