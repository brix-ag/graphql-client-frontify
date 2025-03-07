package ch.brix.gql.client.frontify.input_objects;

public class RgbaColorInput extends ch.brix.gql.client.InputObject {
  /**
   * Red color channel value.
   */
  public RgbaColorInput red(ch.brix.gql.client.frontify.scalars.RgbColorChannelScalar v) {
    values.put("red", v);
    return this;
  }
  /**
   * Green color channel value.
   */
  public RgbaColorInput green(ch.brix.gql.client.frontify.scalars.RgbColorChannelScalar v) {
    values.put("green", v);
    return this;
  }
  /**
   * Blue color channel value.
   */
  public RgbaColorInput blue(ch.brix.gql.client.frontify.scalars.RgbColorChannelScalar v) {
    values.put("blue", v);
    return this;
  }
  /**
   * Alpha channel value.
   */
  public RgbaColorInput alpha(ch.brix.gql.client.frontify.scalars.PercentScalar v) {
    values.put("alpha", v);
    return this;
  }
}
