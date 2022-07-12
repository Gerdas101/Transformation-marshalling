<?xml version = "1.0" encoding = "UTF-8"?>
<xsl:stylesheet  version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <head>
                <title>Libraries</title>
                <link rel="stylesheet" href="styles.css"/>
            </head>

            <body style="background-color: #cafff0;">
                <!--  LIBRARIES TABLE   -->
                <h1 align="center">Libraries</h1>
                <table class="myTable">
                    <tr>
                        <th>Name</th>
                        <th>City</th>
                        <th>Adress</th>
                        <th>Books</th>
                        <th>Employees</th>
                    </tr>
                    <xsl:for-each select="libraries/library">
                        <tr>
                            <td><xsl:value-of select="name"/></td>
                            <td><xsl:value-of select="city"/></td>
                            <td><xsl:value-of select="address"/></td>
                            <td>
                                <ul style="list-style-type:circle; padding-left:0;">
                                    <xsl:for-each select="books/book">
                                        <li>
                                            <xsl:value-of select="name"/>
                                        </li>
                                    </xsl:for-each>
                                </ul>
                            </td>
                            <td>
                                <table class="innerTable">
                                    <tr>
                                        <th>Name</th>
                                        <th>Surname</th>
                                        <th>Gender</th>
                                        <th>Age</th>
                                    </tr>
                                    <xsl:for-each select="employees/employee">
                                        <tr>
                                            <td><xsl:value-of select="name"/></td>
                                            <td><xsl:value-of select="surname"/></td>
                                            <td><xsl:value-of select="gender"/></td>
                                            <td><xsl:value-of select="age"/></td>
                                        </tr>
                                    </xsl:for-each>
                                </table>
                            </td>
                        </tr>
                    </xsl:for-each>
                </table>

                <!--  BOOKS TABLE   -->
                <h1 align="center">Books</h1>
                <table class="myTable">
                    <tr>
                        <th>Name</th>
                        <th>Realise date</th>
                        <th>Pages</th>
                        <th>Category</th>
                        <th>Authors</th>
                    </tr>
                    <xsl:for-each select="libraries/library/books/book">
                        <xsl:if test="not(preceding::book[name/text() = current()/name/text()])">
                            <tr>
                                <td><xsl:value-of select="name"/></td>
                                <td><xsl:value-of select="realiseDate"/></td>
                                <td><xsl:value-of select="pages"/></td>
                                <td><xsl:value-of select="category"/></td>
                                <td>
                                    <table class="innerTable">
                                        <tr>
                                            <th>Name</th>
                                            <th>Surname</th>
                                        </tr>
                                        <xsl:for-each select="authors/author">
                                            <tr>
                                                <td><xsl:value-of select="name"/></td>
                                                <td><xsl:value-of select="surname"/></td>
                                            </tr>
                                        </xsl:for-each>
                                    </table>
                                </td>
                            </tr>
                        </xsl:if>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>