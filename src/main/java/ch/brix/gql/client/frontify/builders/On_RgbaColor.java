package ch.brix.gql.client.frontify.builders;

public class On_RgbaColor extends ch.brix.gql.client.TypeBuilder {
  public On_RgbaColor() {
    super(new ch.brix.gql.client.On("RgbaColor"));
  }
  /**
   * Red color channel value.
   */
  public On_RgbaColor red() {
    _add_field("red");
    return this;
  }
  /**
   * Green color channel value.
   */
  public On_RgbaColor green() {
    _add_field("green");
    return this;
  }
  /**
   * Blue color channel value.
   */
  public On_RgbaColor blue() {
    _add_field("blue");
    return this;
  }
  /**
   * Alpha channel value.
   */
  public On_RgbaColor alpha() {
    _add_field("alpha");
    return this;
  }
}
