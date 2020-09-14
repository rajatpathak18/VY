SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";

INSERT INTO `vy_designation` (`designation_name`) VALUES
('Updeshta'),
('Pracharak'),
('President'),
('Vice-President'),
('Ashram Manager');

INSERT INTO `vy_permission` (`permission_name`) VALUES
('MEMBER_WRITE'),
('MEMBER_READ'),
('REPORT_READ'),
('ROLE_READ'),
('ROLE_WRITE'),
('USER_READ'),
('USER_WRITE');

INSERT INTO `vy_role` (`role_name`) VALUES
('SUPER_ADMIN'),
('ADMIN'),
('UPDESHTA'),
('PRESIDENT'),
('VICE-PRESIDENT'),
('ACCOUNTANT'),
('OPERATOR'),
('ASHRAM_MANAGER');

INSERT INTO `vy_role_permission`(`role_id`, `permission_id`) VALUES ((select role_id from vy_role where role_name='UPDESHTA'),(select permission_id from vy_permission where permission_name = 'MEMBER_WRITE'));
INSERT INTO `vy_role_permission`(`role_id`, `permission_id`) VALUES ((select role_id from vy_role where role_name='UPDESHTA'),(select permission_id from vy_permission where permission_name = 'MEMBER_READ'));
INSERT INTO `vy_role_permission`(`role_id`, `permission_id`) VALUES ((select role_id from vy_role where role_name='UPDESHTA'),(select permission_id from vy_permission where permission_name = 'REPORT_READ'));

INSERT INTO `vy_role_permission`(`role_id`, `permission_id`) VALUES ((select role_id from vy_role where role_name='PRESIDENT'),(select permission_id from vy_permission where permission_name = 'MEMBER_READ')) ;
INSERT INTO `vy_role_permission`(`role_id`, `permission_id`) VALUES ((select role_id from vy_role where role_name='PRESIDENT'),(select permission_id from vy_permission where permission_name = 'MEMBER_WRITE')) ;
INSERT INTO `vy_role_permission`(`role_id`, `permission_id`) VALUES ((select role_id from vy_role where role_name='PRESIDENT'),(select permission_id from vy_permission where permission_name = 'REPORT_READ')) ;
INSERT INTO `vy_role_permission`(`role_id`, `permission_id`) VALUES ((select role_id from vy_role where role_name='PRESIDENT'),(select permission_id from vy_permission where permission_name = 'ROLE_READ')) ;
INSERT INTO `vy_role_permission`(`role_id`, `permission_id`) VALUES ((select role_id from vy_role where role_name='PRESIDENT'),(select permission_id from vy_permission where permission_name = 'ROLE_WRITE')) ;
INSERT INTO `vy_role_permission`(`role_id`, `permission_id`) VALUES ((select role_id from vy_role where role_name='PRESIDENT'),(select permission_id from vy_permission where permission_name = 'USER_READ')) ;
INSERT INTO `vy_role_permission`(`role_id`, `permission_id`) VALUES ((select role_id from vy_role where role_name='PRESIDENT'),(select permission_id from vy_permission where permission_name = 'USER_WRITE')) ;

INSERT INTO `vy_role_permission`(`role_id`, `permission_id`) VALUES ((select role_id from vy_role where role_name='VICE-PRESIDENT'),(select permission_id from vy_permission where permission_name = 'MEMBER_READ'))  ;
INSERT INTO `vy_role_permission`(`role_id`, `permission_id`) VALUES ((select role_id from vy_role where role_name='VICE-PRESIDENT'),(select permission_id from vy_permission where permission_name = 'MEMBER_WRITE')) ;
INSERT INTO `vy_role_permission`(`role_id`, `permission_id`) VALUES ((select role_id from vy_role where role_name='VICE-PRESIDENT'),(select permission_id from vy_permission where permission_name = 'REPORT_READ')) ;
INSERT INTO `vy_role_permission`(`role_id`, `permission_id`) VALUES ((select role_id from vy_role where role_name='VICE-PRESIDENT'),(select permission_id from vy_permission where permission_name = 'ROLE_READ')) ;
INSERT INTO `vy_role_permission`(`role_id`, `permission_id`) VALUES ((select role_id from vy_role where role_name='VICE-PRESIDENT'),(select permission_id from vy_permission where permission_name = 'ROLE_WRITE')) ;
INSERT INTO `vy_role_permission`(`role_id`, `permission_id`) VALUES ((select role_id from vy_role where role_name='VICE-PRESIDENT'),(select permission_id from vy_permission where permission_name = 'USER_READ')) ;
INSERT INTO `vy_role_permission`(`role_id`, `permission_id`) VALUES ((select role_id from vy_role where role_name='VICE-PRESIDENT'),(select permission_id from vy_permission where permission_name = 'USER_WRITE'));

INSERT INTO `vy_role_permission`(`role_id`, `permission_id`) VALUES ((select role_id from vy_role where role_name='OPERATOR'),(select permission_id from vy_permission where permission_name = 'MEMBER_READ')) ;
INSERT INTO `vy_role_permission`(`role_id`, `permission_id`) VALUES ((select role_id from vy_role where role_name='OPERATOR'),(select permission_id from vy_permission where permission_name = 'MEMBER_WRITE')) ;
INSERT INTO `vy_role_permission`(`role_id`, `permission_id`) VALUES ((select role_id from vy_role where role_name='OPERATOR'),(select permission_id from vy_permission where permission_name = 'REPORT_READ'));

INSERT INTO `vy_role_permission`(`role_id`, `permission_id`) VALUES ((select role_id from vy_role where role_name='ADMIN'),(select permission_id from vy_permission where permission_name = 'MEMBER_READ'))  ;
INSERT INTO `vy_role_permission`(`role_id`, `permission_id`) VALUES ((select role_id from vy_role where role_name='ADMIN'),(select permission_id from vy_permission where permission_name = 'MEMBER_WRITE')) ;
INSERT INTO `vy_role_permission`(`role_id`, `permission_id`) VALUES ((select role_id from vy_role where role_name='ADMIN'),(select permission_id from vy_permission where permission_name = 'REPORT_READ')) ;
INSERT INTO `vy_role_permission`(`role_id`, `permission_id`) VALUES ((select role_id from vy_role where role_name='ADMIN'),(select permission_id from vy_permission where permission_name = 'ROLE_READ')) ;
INSERT INTO `vy_role_permission`(`role_id`, `permission_id`) VALUES ((select role_id from vy_role where role_name='ADMIN'),(select permission_id from vy_permission where permission_name = 'ROLE_WRITE'))  ;
INSERT INTO `vy_role_permission`(`role_id`, `permission_id`) VALUES ((select role_id from vy_role where role_name='ADMIN'),(select permission_id from vy_permission where permission_name = 'USER_READ')) ;
INSERT INTO `vy_role_permission`(`role_id`, `permission_id`) VALUES ((select role_id from vy_role where role_name='ADMIN'),(select permission_id from vy_permission where permission_name = 'USER_WRITE'));

INSERT INTO `vy_role_permission`(`role_id`, `permission_id`) VALUES ((select role_id from vy_role where role_name='SUPER_ADMIN'),(select permission_id from vy_permission where permission_name = 'MEMBER_READ'))  ;
INSERT INTO `vy_role_permission`(`role_id`, `permission_id`) VALUES ((select role_id from vy_role where role_name='SUPER_ADMIN'),(select permission_id from vy_permission where permission_name = 'MEMBER_WRITE')) ;
INSERT INTO `vy_role_permission`(`role_id`, `permission_id`) VALUES ((select role_id from vy_role where role_name='SUPER_ADMIN'),(select permission_id from vy_permission where permission_name = 'REPORT_READ')) ;
INSERT INTO `vy_role_permission`(`role_id`, `permission_id`) VALUES ((select role_id from vy_role where role_name='SUPER_ADMIN'),(select permission_id from vy_permission where permission_name = 'ROLE_READ')) ;
INSERT INTO `vy_role_permission`(`role_id`, `permission_id`) VALUES ((select role_id from vy_role where role_name='SUPER_ADMIN'),(select permission_id from vy_permission where permission_name = 'ROLE_WRITE')) ;
INSERT INTO `vy_role_permission`(`role_id`, `permission_id`) VALUES ((select role_id from vy_role where role_name='SUPER_ADMIN'),(select permission_id from vy_permission where permission_name = 'USER_READ')) ;
INSERT INTO `vy_role_permission`(`role_id`, `permission_id`) VALUES ((select role_id from vy_role where role_name='SUPER_ADMIN'),(select permission_id from vy_permission where permission_name = 'USER_WRITE'));

INSERT INTO `vy_role_permission`(`role_id`, `permission_id`) VALUES ((select role_id from vy_role where role_name='ASHRAM_MANAGER'),(select permission_id from vy_permission where permission_name = 'MEMBER_READ')) ;
INSERT INTO `vy_role_permission`(`role_id`, `permission_id`) VALUES ((select role_id from vy_role where role_name='ASHRAM_MANAGER'),(select permission_id from vy_permission where permission_name = 'MEMBER_WRITE')) ;
INSERT INTO `vy_role_permission`(`role_id`, `permission_id`) VALUES ((select role_id from vy_role where role_name='ASHRAM_MANAGER'),(select permission_id from vy_permission where permission_name = 'REPORT_READ')) ;
INSERT INTO `vy_role_permission`(`role_id`, `permission_id`) VALUES ((select role_id from vy_role where role_name='ASHRAM_MANAGER'),(select permission_id from vy_permission where permission_name = 'ROLE_READ')) ;
INSERT INTO `vy_role_permission`(`role_id`, `permission_id`) VALUES ((select role_id from vy_role where role_name='ASHRAM_MANAGER'),(select permission_id from vy_permission where permission_name = 'ROLE_WRITE')) ;
INSERT INTO `vy_role_permission`(`role_id`, `permission_id`) VALUES ((select role_id from vy_role where role_name='ASHRAM_MANAGER'),(select permission_id from vy_permission where permission_name = 'USER_READ')) ;
INSERT INTO `vy_role_permission`(`role_id`, `permission_id`) VALUES ((select role_id from vy_role where role_name='ASHRAM_MANAGER'),(select permission_id from vy_permission where permission_name = 'USER_WRITE'));

-- Inserting super admin data
INSERT INTO `vy_member` (`member_id`, `first_name`, `middle_name`, `last_name`, `dob`, `gender`, `mother_name`, `father_name`, `phone_no`, `alternate_phone_no`, `address_id`, `email_id`, `akshay_patra_id`, `government_id`, `government_id_type`, `nationality`, `member_photo_path`, `govt_id_photo_path`, `associated_since`, `profession`, `practice_level`, `send_email`, `call_flag`, `sms`, `patrika_subscribed`, `has_swarved`, `updeshta_member_id`, `updeshta_name`, `updesh_venue`, `member_photo_id`, `status`, `trash`, `created_at`, `updated_at`, `create_source`, `update_source`) VALUES ('1', 'Super', NULL, 'Admin', '1900-09-13', 'M', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '1924-09-13', NULL, '5', '0', '0', '0', '0', '0', '1', NULL, NULL, NULL, '1', '0', CURRENT_TIMESTAMP, NULL, NULL, NULL);

INSERT INTO `vy_user` (`user_id`, `member_id`, `username`, `password`, `status`, `trash`, `created_at`, `updated_at`) VALUES (NULL, '1', '1', '$2a$10$CvWTw6MgUePbsD64kVTGcegIx4ncvZvXSLWN/22ClpOarJbclehRG', '1', '0', CURRENT_TIMESTAMP, NULL);

INSERT INTO `vy_user_role` (`user_role_id`, `role_id`, `user_id`, `status`, `trash`, `created_at`, `updated_at`) VALUES (NULL, '1', '1', '1', '0', CURRENT_TIMESTAMP, NULL);

COMMIT;
