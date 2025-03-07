package ch.brix.gql.client.frontify.builders;

public class LibraryPageCollection_assets_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * How many `AssetItems` to show per query. Min: 1, Max: 100.
   * Default value: 25
   */
  public LibraryPageCollection_assets_Args limit(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("limit", value);
    return this;
  }
  /**
   * Current page number.
   * Default value: 1
   */
  public LibraryPageCollection_assets_Args page(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("page", value);
    return this;
  }
}
