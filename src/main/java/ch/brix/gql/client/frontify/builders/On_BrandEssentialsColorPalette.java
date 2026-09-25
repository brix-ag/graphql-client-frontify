package ch.brix.gql.client.frontify.builders;

public class On_BrandEssentialsColorPalette extends ch.brix.gql.client.TypeBuilder {
  public On_BrandEssentialsColorPalette() {
    super(new ch.brix.gql.client.On("BrandEssentialsColorPalette"));
  }
  /**
   * **BETA** The unique identifier of the color palette.
   */
  public On_BrandEssentialsColorPalette id() {
    _add_field("id");
    return this;
  }
  /**
   * **BETA** The name of the color palette.
   */
  public On_BrandEssentialsColorPalette name() {
    _add_field("name");
    return this;
  }
  /**
   * **BETA** The description of the color palette.
   */
  public On_BrandEssentialsColorPalette description() {
    _add_field("description");
    return this;
  }
  /**
   * **BETA** `DateTime` of the color palette creation.
   */
  public On_BrandEssentialsColorPalette createdAt() {
    _add_field("createdAt");
    return this;
  }
  /**
   * **BETA** The colors included in the color palette.
   */
  public On_BrandEssentialsColorPalette colors(BrandEssentialsColorPalette_colors callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
