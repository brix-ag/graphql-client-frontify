package ch.brix.gql.client.frontify.builders;

public class LibraryPage_assets_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * How many `LibraryPageAssetItems` to show per query. Min: 1, Max: 100.
   * Default value: 25
   */
  public LibraryPage_assets_Args limit(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("limit", value);
    return this;
  }
  /**
   * Current page number.
   * Default value: 1
   */
  public LibraryPage_assets_Args page(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("page", value);
    return this;
  }
  /**
   * Define search criteria for `Assets` in this `LibraryPage`.
   * Default value: null
   */
  public LibraryPage_assets_Args query(ch.brix.gql.client.frontify.input_objects.LibraryPageAssetQueryInput value) {
    _add_arg("query", value);
    return this;
  }
}
