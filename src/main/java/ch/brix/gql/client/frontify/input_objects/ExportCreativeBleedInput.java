package ch.brix.gql.client.frontify.input_objects;

public class ExportCreativeBleedInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** `Top` value in mm.
   */
  public ExportCreativeBleedInput top(ch.brix.gql.client.frontify.scalars.FloatScalar v) {
    values.put("top", v);
    return this;
  }
  /**
   * **BETA** `Right` value in mm.
   */
  public ExportCreativeBleedInput right(ch.brix.gql.client.frontify.scalars.FloatScalar v) {
    values.put("right", v);
    return this;
  }
  /**
   * **BETA** `Bottom` value in mm.
   */
  public ExportCreativeBleedInput bottom(ch.brix.gql.client.frontify.scalars.FloatScalar v) {
    values.put("bottom", v);
    return this;
  }
  /**
   * **BETA** `Left` value in mm.
   */
  public ExportCreativeBleedInput left(ch.brix.gql.client.frontify.scalars.FloatScalar v) {
    values.put("left", v);
    return this;
  }
}
