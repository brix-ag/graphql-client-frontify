package ch.brix.gql.client.frontify.builders;

public class BrandEssentials_colorPalettes_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * **BETA** Number of items to return per page (max 100).
   * Default value: 100
   */
  public BrandEssentials_colorPalettes_Args limit(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("limit", value);
    return this;
  }
  /**
   * **BETA** Page number to return.
   * Default value: 1
   */
  public BrandEssentials_colorPalettes_Args page(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("page", value);
    return this;
  }
}
