package ch.brix.gql.client.frontify.builders;

public class On_CreativeColor extends ch.brix.gql.client.TypeBuilder {
  public On_CreativeColor() {
    super(new ch.brix.gql.client.On("CreativeColor"));
  }
  /**
   * ID of the `Color`.
   */
  public On_CreativeColor id() {
    _add_field("id");
    return this;
  }
  /**
   * Name of the `Color`.
   */
  public On_CreativeColor name() {
    _add_field("name");
    return this;
  }
  /**
   * Name of the palette that the `Color` belongs to.
   */
  public On_CreativeColor paletteName() {
    _add_field("paletteName");
    return this;
  }
  /**
   * RGBA color value of the `Color`.
   */
  public On_CreativeColor color(CreativeColor_color callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
