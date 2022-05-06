<?xml version="1.0" encoding="utf-8" ?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
   <xsl:template match="/">
      <html>
          <body>
              <h2>Gamer</h2>
              <table border = "1">
                  <tr bgcolor = "@aba3a2">
                      <th>Vardas</th>
                      <th>Pavarde</th>
                      <th>Megstamiaysias zaidimas</th>
                      <th>Megstamiausias zanras</th>
                      <th>Amzius</th>
                  </tr>
                  <xsl:for-each select="Gamers/Gamer">
                      <tr>
                          <td><xsl:value-of select="Name"/></td>
                          <td><xsl:value-of select="Surname"/></td>
                          <td><xsl:value-of select="FavGame"/></td>
                          <td><xsl:value-of select="FavGenre"/></td>
                          <td><xsl:value-of select="Age"/></td>
                      </tr>
                  </xsl:for-each>
              </table>
          </body>
      </html>
   </xsl:template>
</xsl:stylesheet>