// automatically generated by the FlatBuffers compiler, do not modify

package com.dabomstew.pkrandom.generated.swsh;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@javax.annotation.Generated(value="flatc")
@SuppressWarnings("unused")
public final class SwShShopInventory extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_2_0_0(); }
  public static SwShShopInventory getRootAsSwShShopInventory(ByteBuffer _bb) { return getRootAsSwShShopInventory(_bb, new SwShShopInventory()); }
  public static SwShShopInventory getRootAsSwShShopInventory(ByteBuffer _bb, SwShShopInventory obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public SwShShopInventory __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public com.dabomstew.pkrandom.generated.swsh.SwShShop1 shop1(int j) { return shop1(new com.dabomstew.pkrandom.generated.swsh.SwShShop1(), j); }
  public com.dabomstew.pkrandom.generated.swsh.SwShShop1 shop1(com.dabomstew.pkrandom.generated.swsh.SwShShop1 obj, int j) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int shop1Length() { int o = __offset(4); return o != 0 ? __vector_len(o) : 0; }
  public com.dabomstew.pkrandom.generated.swsh.SwShShop1.Vector shop1Vector() { return shop1Vector(new com.dabomstew.pkrandom.generated.swsh.SwShShop1.Vector()); }
  public com.dabomstew.pkrandom.generated.swsh.SwShShop1.Vector shop1Vector(com.dabomstew.pkrandom.generated.swsh.SwShShop1.Vector obj) { int o = __offset(4); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public com.dabomstew.pkrandom.generated.swsh.SwShShop2 shop2(int j) { return shop2(new com.dabomstew.pkrandom.generated.swsh.SwShShop2(), j); }
  public com.dabomstew.pkrandom.generated.swsh.SwShShop2 shop2(com.dabomstew.pkrandom.generated.swsh.SwShShop2 obj, int j) { int o = __offset(6); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int shop2Length() { int o = __offset(6); return o != 0 ? __vector_len(o) : 0; }
  public com.dabomstew.pkrandom.generated.swsh.SwShShop2.Vector shop2Vector() { return shop2Vector(new com.dabomstew.pkrandom.generated.swsh.SwShShop2.Vector()); }
  public com.dabomstew.pkrandom.generated.swsh.SwShShop2.Vector shop2Vector(com.dabomstew.pkrandom.generated.swsh.SwShShop2.Vector obj) { int o = __offset(6); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }

  public static int createSwShShopInventory(FlatBufferBuilder builder,
      int shop1Offset,
      int shop2Offset) {
    builder.startTable(2);
    SwShShopInventory.addShop2(builder, shop2Offset);
    SwShShopInventory.addShop1(builder, shop1Offset);
    return SwShShopInventory.endSwShShopInventory(builder);
  }

  public static void startSwShShopInventory(FlatBufferBuilder builder) { builder.startTable(2); }
  public static void addShop1(FlatBufferBuilder builder, int shop1Offset) { builder.addOffset(0, shop1Offset, 0); }
  public static int createShop1Vector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startShop1Vector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addShop2(FlatBufferBuilder builder, int shop2Offset) { builder.addOffset(1, shop2Offset, 0); }
  public static int createShop2Vector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startShop2Vector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endSwShShopInventory(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }
  public static void finishSwShShopInventoryBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
  public static void finishSizePrefixedSwShShopInventoryBuffer(FlatBufferBuilder builder, int offset) { builder.finishSizePrefixed(offset); }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public SwShShopInventory get(int j) { return get(new SwShShopInventory(), j); }
    public SwShShopInventory get(SwShShopInventory obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

