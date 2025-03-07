package ch.brix.gql.client.frontify.builders;

public class Brand_search_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * How many items to show in the search result field. Min: 1, Max: 100.
   * Default value: 25
   */
  public Brand_search_Args limit(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("limit", value);
    return this;
  }
  /**
   * Current page number.
   * Default value: 1
   */
  public Brand_search_Args page(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("page", value);
    return this;
  }
  /**
   * Query search options.
   * Default value: null
   */
  public Brand_search_Args query(ch.brix.gql.client.frontify.input_objects.BrandQueryInput value) {
    _add_arg("query", value);
    return this;
  }
}
