package ch.brix.gql.client.frontify.input_objects;

public class UpdateBrandDataInput extends ch.brix.gql.client.InputObject {
  /**
   * `Brand` name.
   */
  public UpdateBrandDataInput name(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("name", v);
    return this;
  }
  /**
   * `Brand` color. When not provided, the color will not be updated.
   */
  public UpdateBrandDataInput color(ch.brix.gql.client.frontify.input_objects.RgbaColorInput v) {
    values.put("color", v);
    return this;
  }
}
