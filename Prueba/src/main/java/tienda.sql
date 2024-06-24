-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 24-06-2024 a las 21:50:48
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `tienda`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `contactos`
--

CREATE TABLE `contactos` (
  `idContacto` int(50) NOT NULL,
  `dni` varchar(10) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `correo` varchar(50) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `cp` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `contactos`
--

INSERT INTO `contactos` (`idContacto`, `dni`, `nombre`, `apellido`, `correo`, `direccion`, `cp`) VALUES
(24, '42974898', 'matias', 'moran', 'matias@gmail.com', 'coronel diaz', '2123a'),
(27, '428748212', 'matias', 'garay', 'matymoran@gmail.com', 'coronel diaz 620', '123m');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL,
  `correo` varchar(50) NOT NULL,
  `salt` varchar(256) NOT NULL,
  `contraseñaEncriptada` varchar(256) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id`, `correo`, `salt`, `contraseñaEncriptada`) VALUES
(11, 'gisela', 'ruUWHFHb2+fLNie2HfGkRg==', 'i/rYPnb6dnxzKL1G/wcuaO9WNFP9fPVdbw13M3z2mxw='),
(13, 'gisela2', '5NWDsI0c2MtsovYMFyG04Q==', 'rjZHNfiSICAkjVovZ11MVxpts6pvkEzkHHIouccSNoc='),
(14, 'thematias270', 'snyrkGvWisUQ/+BbesF3XA==', 'RBey6kx183jJ43IUMOG/IeBqwkNyJ3N6DRdXzmxDUX0='),
(15, 'matias esteban', 'YF/H96LfVc2nMt2tQwx8ag==', 'HAiGqci0SoQRGDY4IIn/jrn2vtDyEX+dJXkb/s3/JUs='),
(16, 'gisela23', 'd86T1D/pM83v6aOMn1pNQg==', 'eM61BbuZBywQe/Xp8HS2ZV8vVLxAe58shTH7tK21/QY='),
(17, 'matymoran4@gmail.com', 'I9acjMBA89+1q7LVMXH+IQ==', 'AfqSwBHc+N3NQXbwkbnCx1VyUYzFbCAIQy9rjD9Hb8Q='),
(18, 'matymoran@gmail.com', 'g8OnDrxmY81ClGaCmPdhWA==', 'OydmOV/MxzN6rFxih4bSORZbpdDHzVNQF2wTZfnZbu0='),
(19, 'nicodiaz23@gmail.com', 'OoSS3v9fEdVM/jIRLYoe2w==', 'AJrnXPeurgqUH1ZLAzr/zYJhkezmbkSg0mZzq6RwD/o='),
(20, 'eduardo@gmail.com', 'qa09cs6eeIAcgNInPHsmeA==', 'HX7xEvqZ2UkZlyq0xGKCSt6ZgbgZjCOWqnobMRF2Zkg='),
(21, 'matias@gmail.com', 'lmlC9Cwvb9X1t3ClNpVr2A==', 'zOxD3NUU3+RZNrtdToOtP0vcGMb8fSpz9cPOe2B/a94='),
(22, 'matias23@gmail.com', 'Bq3OAPp1sPKrJV87htFj2g==', '5ydrPBk6E4T3cc4uD6+QtzFZp+O9aouc+NvWdZaVTJk='),
(23, 'batman@gmail.com', 'VRxkWiWQrCKPNwhfu2XcEg==', 'PGOqCecfupH9Y89F9ntzfQltHbTGm1RPNSpWTvLw58Q='),
(24, 'robin@gmail.com', 'zsEmpvuV6uklpneWHav0rw==', 'Cycc4EGr0CaL3lw+6a88NiBbYGMhTgTVIBpB1I7ShIs=');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `contactos`
--
ALTER TABLE `contactos`
  ADD PRIMARY KEY (`idContacto`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`),
  ADD UNIQUE KEY `correo` (`correo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `contactos`
--
ALTER TABLE `contactos`
  MODIFY `idContacto` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
