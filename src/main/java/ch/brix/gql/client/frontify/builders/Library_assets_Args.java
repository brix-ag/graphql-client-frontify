package ch.brix.gql.client.frontify.builders;

public class Library_assets_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * How many `AssetItems` to show per query. Min: 1, Max: 100.
   * Default value: 25
   */
  public Library_assets_Args limit(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("limit", value);
    return this;
  }
  /**
   * Current page number.
   * Default value: 1
   */
  public Library_assets_Args page(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("page", value);
    return this;
  }
  /**
   * Define search criteria for `Assets` in this `Library`.
   * Default value: null
   */
  public Library_assets_Args query(ch.brix.gql.client.frontify.input_objects.AssetQueryInput value) {
    _add_arg("query", value);
    return this;
  }
}
