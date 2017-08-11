package com.quangnguyen.manga.doraemon;

import android.support.annotation.DrawableRes;
import com.quangnguyen.manga.Character;

/**
 * @author QuangNguyen (quangctkm9207).
 */
public class Nobita extends Character {

  @DrawableRes
  private int image;

  public Nobita() {
    super("Nobita");
    image = R.drawable.ic_sample;
  }

  public int getImage() {
    return image;
  }
}
