package ch.brix.gql.client.frontify.builders;

public class On_BrandEssentialsColor extends ch.brix.gql.client.TypeBuilder {
  public On_BrandEssentialsColor() {
    super(new ch.brix.gql.client.On("BrandEssentialsColor"));
  }
  /**
   * **BETA** The unique identifier of the color.
   */
  public On_BrandEssentialsColor id() {
    _add_field("id");
    return this;
  }
  /**
   * **BETA** The name of the color.
   */
  public On_BrandEssentialsColor name() {
    _add_field("name");
    return this;
  }
  /**
   * **BETA** The description of the color.
   */
  public On_BrandEssentialsColor description() {
    _add_field("description");
    return this;
  }
  /**
   * **BETA** The different color representations available for the color.
   */
  public On_BrandEssentialsColor representations(BrandEssentialsColor_representations callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
