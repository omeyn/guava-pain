package org.gbif.oliver.g12;

import org.gbif.oliver.g17.NeedsG17;

public class KillAllTheThings {

  private KillAllTheThings() {
  }

  public static void main(String[] args) {
    NeedsG12 needsG12 = new NeedsG12();
    needsG12.runMe();

    NeedsG17 needsG17 = new NeedsG17();
    needsG17.runMe();
  }
}
