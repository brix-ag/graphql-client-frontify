package ch.brix.gql.client.frontify.input_objects;

public class CreateBrandInput extends ch.brix.gql.client.InputObject {
  /**
   * `Brand` name.
   */
  public CreateBrandInput name(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("name", v);
    return this;
  }
  /**
   * `Brand` color. When not provided, a default color will be used.
   */
  public CreateBrandInput color(ch.brix.gql.client.frontify.input_objects.RgbaColorInput v) {
    values.put("color", v);
    return this;
  }
}
