--
-- Table structure for table `vy_address`
--

CREATE TABLE `vy_address` (
  `address_id` bigint(20) NOT NULL,
  `address` varchar(2000) DEFAULT NULL,
  `city` varchar(100) DEFAULT NULL,
  `postal_code` varchar(11) DEFAULT NULL,
  `country` varchar(100) DEFAULT NULL,
  `state` varchar(100) DEFAULT NULL,
  `landmark` varchar(2000) DEFAULT NULL,
  `alternate_address` varchar(2000) DEFAULT NULL,
  `alternate_city` varchar(100) DEFAULT NULL,
  `alternate_postal_code` varchar(11) DEFAULT NULL,
  `alternate_country` varchar(100) DEFAULT NULL,
  `alternate_state` varchar(100) DEFAULT NULL,
  `alternate_landmark` varchar(2000) DEFAULT NULL,
  `status` tinyint(1) NOT NULL DEFAULT '1',
  `trash` tinyint(1) NOT NULL DEFAULT '0',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


-- --------------------------------------------------------

--
-- Table structure for table `vy_akshay_patra`
--

CREATE TABLE `vy_akshay_patra` (
  `akshay_patra_id` bigint(20) NOT NULL,
  `akshay_patra_num` varchar(60) NOT NULL,
  `patra_allocation_date` date NOT NULL,
  `status` tinyint(1) NOT NULL DEFAULT '1',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `trash` tinyint(1) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `vy_designation`
--

CREATE TABLE `vy_designation` (
  `designation_id` bigint(20) NOT NULL,
  `designation_name` varchar(100) NOT NULL,
  `status` tinyint(1) NOT NULL DEFAULT '1',
  `trash` tinyint(1) NOT NULL DEFAULT '0',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Table structure for table `vy_email`
--

CREATE TABLE `vy_email` (
  `email_id` bigint(20) NOT NULL,
  `email_address_1` varchar(100) DEFAULT NULL,
  `email_address_2` varchar(100) DEFAULT NULL,
  `status` tinyint(1) NOT NULL DEFAULT '1',
  `trash` tinyint(1) NOT NULL DEFAULT '0',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Table structure for table `vy_member`
--

CREATE TABLE `vy_member` (
  `member_id` bigint(20) NOT NULL,
  `first_name` varchar(60) DEFAULT NULL,
  `middle_name` varchar(60) DEFAULT NULL,
  `last_name` varchar(60) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `gender` varchar(1) DEFAULT NULL,
  `mother_name` varchar(120) DEFAULT NULL,
  `father_name` varchar(120) DEFAULT NULL,
  `phone_no` varchar(20) DEFAULT NULL,
  `alternate_phone_no` varchar(20) DEFAULT NULL,
  `address_id` bigint(20) DEFAULT NULL,
  `email_id` bigint(20) DEFAULT NULL,
  `akshay_patra_id` bigint(20) DEFAULT NULL,
  `government_id` varchar(20) DEFAULT NULL,
  `government_id_type` varchar(60) DEFAULT NULL,
  `nationality` varchar(60) DEFAULT NULL,
  `member_photo_path` varchar(500) DEFAULT NULL,
  `govt_id_photo_path` varchar(500) DEFAULT NULL,
  `associated_since` date DEFAULT NULL,
  `profession` varchar(60) DEFAULT NULL,
  `practice_level` int(11) DEFAULT NULL,
  `send_email` tinyint(1) NOT NULL DEFAULT '0',
  `call_flag` tinyint(1) NOT NULL DEFAULT '0',
  `sms` tinyint(1) NOT NULL DEFAULT '0',
  `patrika_subscribed` tinyint(1) NOT NULL DEFAULT '0',
  `has_swarved` tinyint(1) NOT NULL DEFAULT '0',
  `updeshta_member_id` bigint(20) DEFAULT NULL,
  `updeshta_name` varchar(240) DEFAULT NULL,
  `updesh_venue` varchar(120) DEFAULT NULL,
  `member_photo_id` bigint(20) DEFAULT NULL,
  `status` tinyint(1) NOT NULL DEFAULT '1',
  `trash` tinyint(1) NOT NULL DEFAULT '0',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `create_source` varchar(60) DEFAULT NULL,
  `update_source` varchar(60) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


--
-- Table structure for table `vy_member_designation`
--

CREATE TABLE `vy_member_designation` (
  `member_id` bigint(20) NOT NULL,
  `designation_id` bigint(20) NOT NULL,
  `honour_date` date DEFAULT NULL,
  `is_global` tinyint(1) DEFAULT '0',
  `dismiss_date` date DEFAULT NULL,
  `status` tinyint(1) NOT NULL DEFAULT '1',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `trash` tinyint(1) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Table structure for table `vy_member_photo`
--

CREATE TABLE `vy_member_photo` (
  `member_photo_id` bigint(20) NOT NULL,
  `type` varchar(60) DEFAULT NULL,
  `photo_byte` longblob NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Table structure for table `vy_permission`
--

CREATE TABLE `vy_permission` (
  `permission_id` bigint(20) NOT NULL,
  `permission_name` varchar(100) DEFAULT NULL,
  `status` tinyint(1) NOT NULL DEFAULT '1',
  `trash` tinyint(1) NOT NULL DEFAULT '0',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `permisison_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Table structure for table `vy_role`
--

CREATE TABLE `vy_role` (
  `role_id` bigint(20) NOT NULL,
  `role_name` varchar(100) DEFAULT NULL,
  `status` tinyint(1) NOT NULL DEFAULT '1',
  `trash` tinyint(1) NOT NULL DEFAULT '0',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Table structure for table `vy_role_permission`
--

CREATE TABLE `vy_role_permission` (
  `role_permission_id` bigint(20) NOT NULL,
  `role_id` bigint(20) NOT NULL,
  `permission_id` bigint(20) NOT NULL,
  `status` tinyint(1) NOT NULL DEFAULT '1',
  `trash` tinyint(1) NOT NULL DEFAULT '0',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Table structure for table `vy_user`
--

CREATE TABLE `vy_user` (
  `user_id` bigint(20) NOT NULL,
  `member_id` bigint(20) NOT NULL,
  `username` varchar(100) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `status` tinyint(1) NOT NULL DEFAULT '1',
  `trash` tinyint(1) NOT NULL DEFAULT '0',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Table structure for table `vy_user_role`
--

CREATE TABLE `vy_user_role` (
  `user_role_id` bigint(20) NOT NULL,
  `role_id` bigint(20) NOT NULL,
  `user_id` bigint(20) NOT NULL,
  `status` tinyint(1) NOT NULL DEFAULT '1',
  `trash` tinyint(1) NOT NULL DEFAULT '0',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `vy_address`
--
ALTER TABLE `vy_address`
  ADD PRIMARY KEY (`address_id`);

--
-- Indexes for table `vy_akshay_patra`
--
ALTER TABLE `vy_akshay_patra`
  ADD PRIMARY KEY (`akshay_patra_id`),
  ADD UNIQUE KEY `akshay_patra_num` (`akshay_patra_num`),
  ADD UNIQUE KEY `UK_3qnjfrjcowclukehb5nt7ncp2` (`akshay_patra_num`);

--
-- Indexes for table `vy_designation`
--
ALTER TABLE `vy_designation`
  ADD PRIMARY KEY (`designation_id`),
  ADD UNIQUE KEY `designation_name` (`designation_name`),
  ADD UNIQUE KEY `UK_mkxtyoe9ws5d8x1qryuhp8p5i` (`designation_name`);

--
-- Indexes for table `vy_email`
--
ALTER TABLE `vy_email`
  ADD PRIMARY KEY (`email_id`);

--
-- Indexes for table `vy_member`
--
ALTER TABLE `vy_member`
  ADD PRIMARY KEY (`member_id`),
  ADD KEY `updeshta_member_id` (`updeshta_member_id`),
  ADD KEY `FKnggg233mehlvk5mbk5ncwcyya` (`address_id`),
  ADD KEY `FKs3y73i6oyfa8tu025swucdpwp` (`akshay_patra_id`),
  ADD KEY `FKqyh7krb5uecjwdn3w9urmdw8h` (`email_id`),
  ADD KEY `FKn1qn2eh79deg214e1ec2oagqs` (`member_photo_id`);

--
-- Indexes for table `vy_member_designation`
--
ALTER TABLE `vy_member_designation`
  ADD PRIMARY KEY (`member_id`,`designation_id`),
  ADD KEY `member_id` (`member_id`),
  ADD KEY `FK8ngf42kpw7s3e4pd26gdgvejt` (`designation_id`);

--
-- Indexes for table `vy_member_photo`
--
ALTER TABLE `vy_member_photo`
  ADD PRIMARY KEY (`member_photo_id`);

--
-- Indexes for table `vy_permission`
--
ALTER TABLE `vy_permission`
  ADD PRIMARY KEY (`permission_id`),
  ADD UNIQUE KEY `permission_name` (`permission_name`),
  ADD UNIQUE KEY `UK_bwh0ta0pbj33uc9nw9qeouebo` (`permission_name`);

--
-- Indexes for table `vy_role`
--
ALTER TABLE `vy_role`
  ADD PRIMARY KEY (`role_id`),
  ADD UNIQUE KEY `role_name` (`role_name`),
  ADD UNIQUE KEY `UK_pdpi8ky24tjri51rl6jcgbast` (`role_name`);

--
-- Indexes for table `vy_role_permission`
--
ALTER TABLE `vy_role_permission`
  ADD PRIMARY KEY (`role_permission_id`),
  ADD KEY `role_id` (`role_id`),
  ADD KEY `permission_id` (`permission_id`);

--
-- Indexes for table `vy_user`
--
ALTER TABLE `vy_user`
  ADD PRIMARY KEY (`user_id`),
  ADD UNIQUE KEY `username` (`username`),
  ADD UNIQUE KEY `UK_b3ki6csij0wp22l46ffuwkqc7` (`username`),
  ADD KEY `member_id` (`member_id`);

--
-- Indexes for table `vy_user_role`
--
ALTER TABLE `vy_user_role`
  ADD PRIMARY KEY (`user_role_id`),
  ADD KEY `FKo8ssu336b709s3mx728w3b3h0` (`role_id`),
  ADD KEY `FKnxrkfie7g0p2gd5j0t0ej4t9i` (`user_id`);

--
-- Constraints for table `vy_member`
--
ALTER TABLE `vy_member`
  ADD CONSTRAINT `FKn1qn2eh79deg214e1ec2oagqs` FOREIGN KEY (`member_photo_id`) REFERENCES `vy_member_photo` (`member_photo_id`),
  ADD CONSTRAINT `FKnggg233mehlvk5mbk5ncwcyya` FOREIGN KEY (`address_id`) REFERENCES `vy_address` (`address_id`),
  ADD CONSTRAINT `FKqyh7krb5uecjwdn3w9urmdw8h` FOREIGN KEY (`email_id`) REFERENCES `vy_email` (`email_id`),
  ADD CONSTRAINT `FKs3y73i6oyfa8tu025swucdpwp` FOREIGN KEY (`akshay_patra_id`) REFERENCES `vy_akshay_patra` (`akshay_patra_id`),
  ADD CONSTRAINT `vy_member_ibfk_1` FOREIGN KEY (`address_id`) REFERENCES `vy_address` (`address_id`),
  ADD CONSTRAINT `vy_member_ibfk_2` FOREIGN KEY (`akshay_patra_id`) REFERENCES `vy_akshay_patra` (`akshay_patra_id`),
  ADD CONSTRAINT `vy_member_ibfk_3` FOREIGN KEY (`email_id`) REFERENCES `vy_email` (`email_id`),
  ADD CONSTRAINT `vy_member_ibfk_4` FOREIGN KEY (`member_photo_id`) REFERENCES `vy_member_photo` (`member_photo_id`);

--
-- Constraints for table `vy_member_designation`
--
ALTER TABLE `vy_member_designation`
  ADD CONSTRAINT `FK8ngf42kpw7s3e4pd26gdgvejt` FOREIGN KEY (`designation_id`) REFERENCES `vy_designation` (`designation_id`),
  ADD CONSTRAINT `FKlilnbrrs8gc00hais1rn7s2pd` FOREIGN KEY (`member_id`) REFERENCES `vy_member` (`member_id`),
  ADD CONSTRAINT `vy_member_designation_ibfk_1` FOREIGN KEY (`member_id`) REFERENCES `vy_member` (`member_id`),
  ADD CONSTRAINT `vy_member_designation_ibfk_2` FOREIGN KEY (`designation_id`) REFERENCES `vy_designation` (`designation_id`);

--
-- Constraints for table `vy_role_permission`
--
ALTER TABLE `vy_role_permission`
  ADD CONSTRAINT `FK3e6b6s2xj2fupjnhbh7p4g20t` FOREIGN KEY (`role_id`) REFERENCES `vy_role` (`role_id`),
  ADD CONSTRAINT `FKhodgirvf6yevvf2ajt5ckm2p1` FOREIGN KEY (`permission_id`) REFERENCES `vy_permission` (`permission_id`),
  ADD CONSTRAINT `vy_role_permission_ibfk_1` FOREIGN KEY (`role_id`) REFERENCES `vy_role` (`role_id`),
  ADD CONSTRAINT `vy_role_permission_ibfk_2` FOREIGN KEY (`permission_id`) REFERENCES `vy_permission` (`permission_id`);

--
-- Constraints for table `vy_user`
--
ALTER TABLE `vy_user`
  ADD CONSTRAINT `FKj8ilfjrdai89et5x1qsjqeq5m` FOREIGN KEY (`member_id`) REFERENCES `vy_member` (`member_id`),
  ADD CONSTRAINT `vy_user_ibfk_1` FOREIGN KEY (`member_id`) REFERENCES `vy_member` (`member_id`);

--
-- Constraints for table `vy_user_role`
--
ALTER TABLE `vy_user_role`
  ADD CONSTRAINT `FKnxrkfie7g0p2gd5j0t0ej4t9i` FOREIGN KEY (`user_id`) REFERENCES `vy_user` (`user_id`),
  ADD CONSTRAINT `FKo8ssu336b709s3mx728w3b3h0` FOREIGN KEY (`role_id`) REFERENCES `vy_role` (`role_id`),
  ADD CONSTRAINT `vy_user_role_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `vy_user` (`user_id`),
  ADD CONSTRAINT `vy_user_role_ibfk_2` FOREIGN KEY (`role_id`) REFERENCES `vy_role` (`role_id`);


--
-- Bootstrap data
--
INSERT INTO `vy_member` (`first_name`, `middle_name`, `last_name`, `dob`, `gender`, `mother_name`, `father_name`, `phone_no`, `alternate_phone_no`, `address_id`, `email_id`, `akshay_patra_id`, `government_id`, `government_id_type`, `nationality`, `member_photo_path`, `govt_id_photo_path`, `associated_since`, `profession`, `practice_level`, `send_email`, `call_flag`, `sms`, `patrika_subscribed`, `has_swarved`, `updeshta_member_id`, `updeshta_name`, `updesh_venue`, `member_photo_id`, `status`, `trash`, `create_source`, `update_source`) VALUES
('SUPER', '', 'ADMIN', '1988-05-04', 'M', '', '', '+919632330839', '', NULL, NULL, NULL, NULL, NULL, 'Indian', NULL, NULL, '1990-05-04', 'IT Manager', 1, 0, 0, 0, 0, 0, NULL, NULL, NULL, NULL, 0, 0, 'system', 'system');