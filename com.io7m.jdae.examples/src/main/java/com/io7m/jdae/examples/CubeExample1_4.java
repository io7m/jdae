/*
 * Copyright © 2015 <code@io7m.com> http://io7m.com
 *
 * This work is placed into the public domain for free use by anyone
 * for any purpose. It may be freely used, modified, and distributed.
 *
 * In jurisdictions that do not recognise the public domain this work
 * may be freely used, modified, and distributed without restriction.
 *
 * This work comes with absolutely no warranty.
 */

package com.io7m.jdae.examples;

import com.io7m.jdae.collada1_4.COLLADA;
import com.io7m.jdae.collada1_4.Geometry;
import com.io7m.jdae.collada1_4.LibraryGeometries;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.InputStream;
import java.util.List;

public final class CubeExample1_4
{
  private CubeExample1_4()
  {
    throw new AssertionError("Unreachable code");
  }

  public static void main(final String[] args)
    throws Exception
  {
    final JAXBContext jc = JAXBContext.newInstance("com.io7m.jdae.collada1_4");
    final Unmarshaller u = jc.createUnmarshaller();

    final InputStream is = CubeExample1_4.class.getResourceAsStream("cube.dae");
    try {
      final COLLADA c = (COLLADA) u.unmarshal(is);
      System.out.println("Version: " + c.getVersion());
      System.out.println("Base:    " + c.getBase());

      for (final Object o : c.getLibraries()) {
        if (o instanceof LibraryGeometries) {
          final LibraryGeometries gs = (LibraryGeometries) o;
          final List<Geometry> gss = gs.getGeometry();
          for (final Geometry g : gss) {
            System.out.println("Geometry name: " + g.getName());
            System.out.println("Geometry id:   " + g.getId());
          }
        }
      }

    } finally {
      is.close();
    }
  }
}
