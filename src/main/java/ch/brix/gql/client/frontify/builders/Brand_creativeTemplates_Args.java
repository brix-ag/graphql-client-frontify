package ch.brix.gql.client.frontify.builders;

public class Brand_creativeTemplates_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * How many items to show in the search result field. Min: 1, Max: 100.
   * Default value: 25
   */
  public Brand_creativeTemplates_Args limit(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("limit", value);
    return this;
  }
  /**
   * Current page number.
   * Default value: 1
   */
  public Brand_creativeTemplates_Args page(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("page", value);
    return this;
  }
  /**
   * Define search criteria for `CreativeTemplate` items in a `Brand`.
   * Default value: null
   */
  public Brand_creativeTemplates_Args query(ch.brix.gql.client.frontify.input_objects.CreativeTemplateQueryInput value) {
    _add_arg("query", value);
    return this;
  }
}
