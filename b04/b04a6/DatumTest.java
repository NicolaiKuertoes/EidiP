/**
 * @author nkuert2s
 */
public class DatumTest {
  public static boolean datumCheck(int date, boolean erw) {
    boolean erg = Datum.istSchaltjahr(date);
    if (erg != erw) {
      // Sie koennen das Format der Ausgabe nach Geschmack aendern
      System.out.println("FEHLER fuer istSchaltjahr(" + date + "): " + erg + " statt " + erw);
    }
    return erg == erw;
  }

  public static boolean test() {
    return (datumCheck(1400, true)
        & datumCheck(1401, false)
        & datumCheck(1402, false)
        & datumCheck(1403, false)
        & datumCheck(1404, true)
        & datumCheck(1405, false)
        & datumCheck(1406, false)
        & datumCheck(1407, false)
        & datumCheck(1408, true)
        & datumCheck(1409, false)
        & datumCheck(1410, false)
        & datumCheck(1411, false)
        & datumCheck(1412, true)
        & datumCheck(1413, false)
        & datumCheck(1414, false)
        & datumCheck(1415, false)
        & datumCheck(1416, true)
        & datumCheck(1417, false)
        & datumCheck(1418, false)
        & datumCheck(1419, false)
        & datumCheck(1420, true)
        & datumCheck(1421, false)
        & datumCheck(1422, false)
        & datumCheck(1423, false)
        & datumCheck(1424, true)
        & datumCheck(1425, false)
        & datumCheck(1426, false)
        & datumCheck(1427, false)
        & datumCheck(1428, true)
        & datumCheck(1429, false)
        & datumCheck(1430, false)
        & datumCheck(1431, false)
        & datumCheck(1432, true)
        & datumCheck(1433, false)
        & datumCheck(1434, false)
        & datumCheck(1435, false)
        & datumCheck(1436, true)
        & datumCheck(1437, false)
        & datumCheck(1438, false)
        & datumCheck(1439, false)
        & datumCheck(1440, true)
        & datumCheck(1441, false)
        & datumCheck(1442, false)
        & datumCheck(1443, false)
        & datumCheck(1444, true)
        & datumCheck(1445, false)
        & datumCheck(1446, false)
        & datumCheck(1447, false)
        & datumCheck(1448, true)
        & datumCheck(1449, false)
        & datumCheck(1450, false)
        & datumCheck(1451, false)
        & datumCheck(1452, true)
        & datumCheck(1453, false)
        & datumCheck(1454, false)
        & datumCheck(1455, false)
        & datumCheck(1456, true)
        & datumCheck(1457, false)
        & datumCheck(1458, false)
        & datumCheck(1459, false)
        & datumCheck(1460, true)
        & datumCheck(1461, false)
        & datumCheck(1462, false)
        & datumCheck(1463, false)
        & datumCheck(1464, true)
        & datumCheck(1465, false)
        & datumCheck(1466, false)
        & datumCheck(1467, false)
        & datumCheck(1468, true)
        & datumCheck(1469, false)
        & datumCheck(1470, false)
        & datumCheck(1471, false)
        & datumCheck(1472, true)
        & datumCheck(1473, false)
        & datumCheck(1474, false)
        & datumCheck(1475, false)
        & datumCheck(1476, true)
        & datumCheck(1477, false)
        & datumCheck(1478, false)
        & datumCheck(1479, false)
        & datumCheck(1480, true)
        & datumCheck(1481, false)
        & datumCheck(1482, false)
        & datumCheck(1483, false)
        & datumCheck(1484, true)
        & datumCheck(1485, false)
        & datumCheck(1486, false)
        & datumCheck(1487, false)
        & datumCheck(1488, true)
        & datumCheck(1489, false)
        & datumCheck(1490, false)
        & datumCheck(1491, false)
        & datumCheck(1492, true)
        & datumCheck(1493, false)
        & datumCheck(1494, false)
        & datumCheck(1495, false)
        & datumCheck(1496, true)
        & datumCheck(1497, false)
        & datumCheck(1498, false)
        & datumCheck(1499, false)
        & datumCheck(1500, true)
        & datumCheck(1501, false)
        & datumCheck(1502, false)
        & datumCheck(1503, false)
        & datumCheck(1504, true)
        & datumCheck(1505, false)
        & datumCheck(1506, false)
        & datumCheck(1507, false)
        & datumCheck(1508, true)
        & datumCheck(1509, false)
        & datumCheck(1510, false)
        & datumCheck(1511, false)
        & datumCheck(1512, true)
        & datumCheck(1513, false)
        & datumCheck(1514, false)
        & datumCheck(1515, false)
        & datumCheck(1516, true)
        & datumCheck(1517, false)
        & datumCheck(1518, false)
        & datumCheck(1519, false)
        & datumCheck(1520, true)
        & datumCheck(1521, false)
        & datumCheck(1522, false)
        & datumCheck(1523, false)
        & datumCheck(1524, true)
        & datumCheck(1525, false)
        & datumCheck(1526, false)
        & datumCheck(1527, false)
        & datumCheck(1528, true)
        & datumCheck(1529, false)
        & datumCheck(1530, false)
        & datumCheck(1531, false)
        & datumCheck(1532, true)
        & datumCheck(1533, false)
        & datumCheck(1534, false)
        & datumCheck(1535, false)
        & datumCheck(1536, true)
        & datumCheck(1537, false)
        & datumCheck(1538, false)
        & datumCheck(1539, false)
        & datumCheck(1540, true)
        & datumCheck(1541, false)
        & datumCheck(1542, false)
        & datumCheck(1543, false)
        & datumCheck(1544, true)
        & datumCheck(1545, false)
        & datumCheck(1546, false)
        & datumCheck(1547, false)
        & datumCheck(1548, true)
        & datumCheck(1549, false)
        & datumCheck(1550, false)
        & datumCheck(1551, false)
        & datumCheck(1552, true)
        & datumCheck(1553, false)
        & datumCheck(1554, false)
        & datumCheck(1555, false)
        & datumCheck(1556, true)
        & datumCheck(1557, false)
        & datumCheck(1558, false)
        & datumCheck(1559, false)
        & datumCheck(1560, true)
        & datumCheck(1561, false)
        & datumCheck(1562, false)
        & datumCheck(1563, false)
        & datumCheck(1564, true)
        & datumCheck(1565, false)
        & datumCheck(1566, false)
        & datumCheck(1567, false)
        & datumCheck(1568, true)
        & datumCheck(1569, false)
        & datumCheck(1570, false)
        & datumCheck(1571, false)
        & datumCheck(1572, true)
        & datumCheck(1573, false)
        & datumCheck(1574, false)
        & datumCheck(1575, false)
        & datumCheck(1576, true)
        & datumCheck(1577, false)
        & datumCheck(1578, false)
        & datumCheck(1579, false)
        & datumCheck(1580, true)
        & datumCheck(1581, false)
        & datumCheck(1582, false)
        & datumCheck(1583, false)
        & datumCheck(1584, true)
        & datumCheck(1585, false)
        & datumCheck(1586, false)
        & datumCheck(1587, false)
        & datumCheck(1588, true)
        & datumCheck(1589, false)
        & datumCheck(1590, false)
        & datumCheck(1591, false)
        & datumCheck(1592, true)
        & datumCheck(1593, false)
        & datumCheck(1594, false)
        & datumCheck(1595, false)
        & datumCheck(1596, true)
        & datumCheck(1597, false)
        & datumCheck(1598, false)
        & datumCheck(1599, false)
        & datumCheck(1600, true)
        & datumCheck(1601, false)
        & datumCheck(1602, false)
        & datumCheck(1603, false)
        & datumCheck(1604, true)
        & datumCheck(1605, false)
        & datumCheck(1606, false)
        & datumCheck(1607, false)
        & datumCheck(1608, true)
        & datumCheck(1609, false)
        & datumCheck(1610, false)
        & datumCheck(1611, false)
        & datumCheck(1612, true)
        & datumCheck(1613, false)
        & datumCheck(1614, false)
        & datumCheck(1615, false)
        & datumCheck(1616, true)
        & datumCheck(1617, false)
        & datumCheck(1618, false)
        & datumCheck(1619, false)
        & datumCheck(1620, true)
        & datumCheck(1621, false)
        & datumCheck(1622, false)
        & datumCheck(1623, false)
        & datumCheck(1624, true)
        & datumCheck(1625, false)
        & datumCheck(1626, false)
        & datumCheck(1627, false)
        & datumCheck(1628, true)
        & datumCheck(1629, false)
        & datumCheck(1630, false)
        & datumCheck(1631, false)
        & datumCheck(1632, true)
        & datumCheck(1633, false)
        & datumCheck(1634, false)
        & datumCheck(1635, false)
        & datumCheck(1636, true)
        & datumCheck(1637, false)
        & datumCheck(1638, false)
        & datumCheck(1639, false)
        & datumCheck(1640, true)
        & datumCheck(1641, false)
        & datumCheck(1642, false)
        & datumCheck(1643, false)
        & datumCheck(1644, true)
        & datumCheck(1645, false)
        & datumCheck(1646, false)
        & datumCheck(1647, false)
        & datumCheck(1648, true)
        & datumCheck(1649, false)
        & datumCheck(1650, false)
        & datumCheck(1651, false)
        & datumCheck(1652, true)
        & datumCheck(1653, false)
        & datumCheck(1654, false)
        & datumCheck(1655, false)
        & datumCheck(1656, true)
        & datumCheck(1657, false)
        & datumCheck(1658, false)
        & datumCheck(1659, false)
        & datumCheck(1660, true)
        & datumCheck(1661, false)
        & datumCheck(1662, false)
        & datumCheck(1663, false)
        & datumCheck(1664, true)
        & datumCheck(1665, false)
        & datumCheck(1666, false)
        & datumCheck(1667, false)
        & datumCheck(1668, true)
        & datumCheck(1669, false)
        & datumCheck(1670, false)
        & datumCheck(1671, false)
        & datumCheck(1672, true)
        & datumCheck(1673, false)
        & datumCheck(1674, false)
        & datumCheck(1675, false)
        & datumCheck(1676, true)
        & datumCheck(1677, false)
        & datumCheck(1678, false)
        & datumCheck(1679, false)
        & datumCheck(1680, true)
        & datumCheck(1681, false)
        & datumCheck(1682, false)
        & datumCheck(1683, false)
        & datumCheck(1684, true)
        & datumCheck(1685, false)
        & datumCheck(1686, false)
        & datumCheck(1687, false)
        & datumCheck(1688, true)
        & datumCheck(1689, false)
        & datumCheck(1690, false)
        & datumCheck(1691, false)
        & datumCheck(1692, true)
        & datumCheck(1693, false)
        & datumCheck(1694, false)
        & datumCheck(1695, false)
        & datumCheck(1696, true)
        & datumCheck(1697, false)
        & datumCheck(1698, false)
        & datumCheck(1699, false)
        & datumCheck(1700, false)
        & datumCheck(1701, false)
        & datumCheck(1702, false)
        & datumCheck(1703, false)
        & datumCheck(1704, true)
        & datumCheck(1705, false)
        & datumCheck(1706, false)
        & datumCheck(1707, false)
        & datumCheck(1708, true)
        & datumCheck(1709, false)
        & datumCheck(1710, false)
        & datumCheck(1711, false)
        & datumCheck(1712, true)
        & datumCheck(1713, false)
        & datumCheck(1714, false)
        & datumCheck(1715, false)
        & datumCheck(1716, true)
        & datumCheck(1717, false)
        & datumCheck(1718, false)
        & datumCheck(1719, false)
        & datumCheck(1720, true)
        & datumCheck(1721, false)
        & datumCheck(1722, false)
        & datumCheck(1723, false)
        & datumCheck(1724, true)
        & datumCheck(1725, false)
        & datumCheck(1726, false)
        & datumCheck(1727, false)
        & datumCheck(1728, true)
        & datumCheck(1729, false)
        & datumCheck(1730, false)
        & datumCheck(1731, false)
        & datumCheck(1732, true)
        & datumCheck(1733, false)
        & datumCheck(1734, false)
        & datumCheck(1735, false)
        & datumCheck(1736, true)
        & datumCheck(1737, false)
        & datumCheck(1738, false)
        & datumCheck(1739, false)
        & datumCheck(1740, true)
        & datumCheck(1741, false)
        & datumCheck(1742, false)
        & datumCheck(1743, false)
        & datumCheck(1744, true)
        & datumCheck(1745, false)
        & datumCheck(1746, false)
        & datumCheck(1747, false)
        & datumCheck(1748, true)
        & datumCheck(1749, false)
        & datumCheck(1750, false)
        & datumCheck(1751, false)
        & datumCheck(1752, true)
        & datumCheck(1753, false)
        & datumCheck(1754, false)
        & datumCheck(1755, false)
        & datumCheck(1756, true)
        & datumCheck(1757, false)
        & datumCheck(1758, false)
        & datumCheck(1759, false)
        & datumCheck(1760, true)
        & datumCheck(1761, false)
        & datumCheck(1762, false)
        & datumCheck(1763, false)
        & datumCheck(1764, true)
        & datumCheck(1765, false)
        & datumCheck(1766, false)
        & datumCheck(1767, false)
        & datumCheck(1768, true)
        & datumCheck(1769, false)
        & datumCheck(1770, false)
        & datumCheck(1771, false)
        & datumCheck(1772, true)
        & datumCheck(1773, false)
        & datumCheck(1774, false)
        & datumCheck(1775, false)
        & datumCheck(1776, true)
        & datumCheck(1777, false)
        & datumCheck(1778, false)
        & datumCheck(1779, false)
        & datumCheck(1780, true)
        & datumCheck(1781, false)
        & datumCheck(1782, false)
        & datumCheck(1783, false)
        & datumCheck(1784, true)
        & datumCheck(1785, false)
        & datumCheck(1786, false)
        & datumCheck(1787, false)
        & datumCheck(1788, true)
        & datumCheck(1789, false)
        & datumCheck(1790, false)
        & datumCheck(1791, false)
        & datumCheck(1792, true)
        & datumCheck(1793, false)
        & datumCheck(1794, false)
        & datumCheck(1795, false)
        & datumCheck(1796, true)
        & datumCheck(1797, false)
        & datumCheck(1798, false)
        & datumCheck(1799, false)
        & datumCheck(1800, false)
        & datumCheck(1801, false)
        & datumCheck(1802, false)
        & datumCheck(1803, false)
        & datumCheck(1804, true)
        & datumCheck(1805, false)
        & datumCheck(1806, false)
        & datumCheck(1807, false)
        & datumCheck(1808, true)
        & datumCheck(1809, false)
        & datumCheck(1810, false)
        & datumCheck(1811, false)
        & datumCheck(1812, true)
        & datumCheck(1813, false)
        & datumCheck(1814, false)
        & datumCheck(1815, false)
        & datumCheck(1816, true)
        & datumCheck(1817, false)
        & datumCheck(1818, false)
        & datumCheck(1819, false)
        & datumCheck(1820, true)
        & datumCheck(1821, false)
        & datumCheck(1822, false)
        & datumCheck(1823, false)
        & datumCheck(1824, true)
        & datumCheck(1825, false)
        & datumCheck(1826, false)
        & datumCheck(1827, false)
        & datumCheck(1828, true)
        & datumCheck(1829, false)
        & datumCheck(1830, false)
        & datumCheck(1831, false)
        & datumCheck(1832, true)
        & datumCheck(1833, false)
        & datumCheck(1834, false)
        & datumCheck(1835, false)
        & datumCheck(1836, true)
        & datumCheck(1837, false)
        & datumCheck(1838, false)
        & datumCheck(1839, false)
        & datumCheck(1840, true)
        & datumCheck(1841, false)
        & datumCheck(1842, false)
        & datumCheck(1843, false)
        & datumCheck(1844, true)
        & datumCheck(1845, false)
        & datumCheck(1846, false)
        & datumCheck(1847, false)
        & datumCheck(1848, true)
        & datumCheck(1849, false)
        & datumCheck(1850, false)
        & datumCheck(1851, false)
        & datumCheck(1852, true)
        & datumCheck(1853, false)
        & datumCheck(1854, false)
        & datumCheck(1855, false)
        & datumCheck(1856, true)
        & datumCheck(1857, false)
        & datumCheck(1858, false)
        & datumCheck(1859, false)
        & datumCheck(1860, true)
        & datumCheck(1861, false)
        & datumCheck(1862, false)
        & datumCheck(1863, false)
        & datumCheck(1864, true)
        & datumCheck(1865, false)
        & datumCheck(1866, false)
        & datumCheck(1867, false)
        & datumCheck(1868, true)
        & datumCheck(1869, false)
        & datumCheck(1870, false)
        & datumCheck(1871, false)
        & datumCheck(1872, true)
        & datumCheck(1873, false)
        & datumCheck(1874, false)
        & datumCheck(1875, false)
        & datumCheck(1876, true)
        & datumCheck(1877, false)
        & datumCheck(1878, false)
        & datumCheck(1879, false)
        & datumCheck(1880, true)
        & datumCheck(1881, false)
        & datumCheck(1882, false)
        & datumCheck(1883, false)
        & datumCheck(1884, true)
        & datumCheck(1885, false)
        & datumCheck(1886, false)
        & datumCheck(1887, false)
        & datumCheck(1888, true)
        & datumCheck(1889, false)
        & datumCheck(1890, false)
        & datumCheck(1891, false)
        & datumCheck(1892, true)
        & datumCheck(1893, false)
        & datumCheck(1894, false)
        & datumCheck(1895, false)
        & datumCheck(1896, true)
        & datumCheck(1897, false)
        & datumCheck(1898, false)
        & datumCheck(1899, false)
        & datumCheck(1900, false)
        & datumCheck(1901, false)
        & datumCheck(1902, false)
        & datumCheck(1903, false)
        & datumCheck(1904, true)
        & datumCheck(1905, false)
        & datumCheck(1906, false)
        & datumCheck(1907, false)
        & datumCheck(1908, true)
        & datumCheck(1909, false)
        & datumCheck(1910, false)
        & datumCheck(1911, false)
        & datumCheck(1912, true)
        & datumCheck(1913, false)
        & datumCheck(1914, false)
        & datumCheck(1915, false)
        & datumCheck(1916, true)
        & datumCheck(1917, false)
        & datumCheck(1918, false)
        & datumCheck(1919, false)
        & datumCheck(1920, true)
        & datumCheck(1921, false)
        & datumCheck(1922, false)
        & datumCheck(1923, false)
        & datumCheck(1924, true)
        & datumCheck(1925, false)
        & datumCheck(1926, false)
        & datumCheck(1927, false)
        & datumCheck(1928, true)
        & datumCheck(1929, false)
        & datumCheck(1930, false)
        & datumCheck(1931, false)
        & datumCheck(1932, true)
        & datumCheck(1933, false)
        & datumCheck(1934, false)
        & datumCheck(1935, false)
        & datumCheck(1936, true)
        & datumCheck(1937, false)
        & datumCheck(1938, false)
        & datumCheck(1939, false)
        & datumCheck(1940, true)
        & datumCheck(1941, false)
        & datumCheck(1942, false)
        & datumCheck(1943, false)
        & datumCheck(1944, true)
        & datumCheck(1945, false)
        & datumCheck(1946, false)
        & datumCheck(1947, false)
        & datumCheck(1948, true)
        & datumCheck(1949, false)
        & datumCheck(1950, false)
        & datumCheck(1951, false)
        & datumCheck(1952, true)
        & datumCheck(1953, false)
        & datumCheck(1954, false)
        & datumCheck(1955, false)
        & datumCheck(1956, true)
        & datumCheck(1957, false)
        & datumCheck(1958, false)
        & datumCheck(1959, false)
        & datumCheck(1960, true)
        & datumCheck(1961, false)
        & datumCheck(1962, false)
        & datumCheck(1963, false)
        & datumCheck(1964, true)
        & datumCheck(1965, false)
        & datumCheck(1966, false)
        & datumCheck(1967, false)
        & datumCheck(1968, true)
        & datumCheck(1969, false)
        & datumCheck(1970, false)
        & datumCheck(1971, false)
        & datumCheck(1972, true)
        & datumCheck(1973, false)
        & datumCheck(1974, false)
        & datumCheck(1975, false)
        & datumCheck(1976, true)
        & datumCheck(1977, false)
        & datumCheck(1978, false)
        & datumCheck(1979, false)
        & datumCheck(1980, true)
        & datumCheck(1981, false)
        & datumCheck(1982, false)
        & datumCheck(1983, false)
        & datumCheck(1984, true)
        & datumCheck(1985, false)
        & datumCheck(1986, false)
        & datumCheck(1987, false)
        & datumCheck(1988, true)
        & datumCheck(1989, false)
        & datumCheck(1990, false)
        & datumCheck(1991, false)
        & datumCheck(1992, true)
        & datumCheck(1993, false)
        & datumCheck(1994, false)
        & datumCheck(1995, false)
        & datumCheck(1996, true)
        & datumCheck(1997, false)
        & datumCheck(1998, false)
        & datumCheck(1999, false)
        & datumCheck(2000, true)
        & datumCheck(2001, false)
        & datumCheck(2002, false)
        & datumCheck(2003, false)
        & datumCheck(2004, true)
        & datumCheck(2005, false)
        & datumCheck(2006, false)
        & datumCheck(2007, false)
        & datumCheck(2008, true)
        & datumCheck(2009, false)
        & datumCheck(2010, false)
        & datumCheck(2011, false)
        & datumCheck(2012, true)
        & datumCheck(2013, false)
        & datumCheck(2014, false)
        & datumCheck(2015, false)
        & datumCheck(2016, true)
        & datumCheck(2017, false)
        & datumCheck(2018, false)
        & datumCheck(2019, false)
        & datumCheck(2020, true)
        & datumCheck(2021, false)
        & datumCheck(2022, false)
        & datumCheck(2023, false)
        & datumCheck(2024, true)
        & datumCheck(2025, false)
        & datumCheck(2026, false)
        & datumCheck(2027, false)
        & datumCheck(2028, true)
        & datumCheck(2029, false)
        & datumCheck(2030, false)
        & datumCheck(2031, false)
        & datumCheck(2032, true)
        & datumCheck(2033, false)
        & datumCheck(2034, false)
        & datumCheck(2035, false)
        & datumCheck(2036, true)
        & datumCheck(2037, false)
        & datumCheck(2038, false)
        & datumCheck(2039, false)
        & datumCheck(2040, true)
        & datumCheck(2041, false)
        & datumCheck(2042, false)
        & datumCheck(2043, false)
        & datumCheck(2044, true)
        & datumCheck(2045, false)
        & datumCheck(2046, false)
        & datumCheck(2047, false)
        & datumCheck(2048, true)
        & datumCheck(2049, false)
        & datumCheck(2050, false)
        & datumCheck(2051, false)
        & datumCheck(2052, true)
        & datumCheck(2053, false)
        & datumCheck(2054, false)
        & datumCheck(2055, false)
        & datumCheck(2056, true)
        & datumCheck(2057, false)
        & datumCheck(2058, false)
        & datumCheck(2059, false)
        & datumCheck(2060, true)
        & datumCheck(2061, false)
        & datumCheck(2062, false)
        & datumCheck(2063, false)
        & datumCheck(2064, true)
        & datumCheck(2065, false)
        & datumCheck(2066, false)
        & datumCheck(2067, false)
        & datumCheck(2068, true)
        & datumCheck(2069, false)
        & datumCheck(2070, false)
        & datumCheck(2071, false)
        & datumCheck(2072, true)
        & datumCheck(2073, false)
        & datumCheck(2074, false)
        & datumCheck(2075, false)
        & datumCheck(2076, true)
        & datumCheck(2077, false)
        & datumCheck(2078, false)
        & datumCheck(2079, false)
        & datumCheck(2080, true)
        & datumCheck(2081, false)
        & datumCheck(2082, false)
        & datumCheck(2083, false)
        & datumCheck(2084, true)
        & datumCheck(2085, false)
        & datumCheck(2086, false)
        & datumCheck(2087, false)
        & datumCheck(2088, true)
        & datumCheck(2089, false)
        & datumCheck(2090, false)
        & datumCheck(2091, false)
        & datumCheck(2092, true)
        & datumCheck(2093, false)
        & datumCheck(2094, false)
        & datumCheck(2095, false)
        & datumCheck(2096, true)
        & datumCheck(2097, false)
        & datumCheck(2098, false)
        & datumCheck(2099, false)
        & datumCheck(2100, false)
        & datumCheck(2101, false)
        & datumCheck(2102, false)
        & datumCheck(2103, false)
        & datumCheck(2104, true)
        & datumCheck(2105, false)
        & datumCheck(2106, false)
        & datumCheck(2107, false)
        & datumCheck(2108, true)
        & datumCheck(2109, false)
        & datumCheck(2110, false)
        & datumCheck(2111, false)
        & datumCheck(2112, true)
        & datumCheck(2113, false)
        & datumCheck(2114, false)
        & datumCheck(2115, false)
        & datumCheck(2116, true)
        & datumCheck(2117, false)
        & datumCheck(2118, false)
        & datumCheck(2119, false)
        & datumCheck(2120, true)
        & datumCheck(2121, false));
  }
}