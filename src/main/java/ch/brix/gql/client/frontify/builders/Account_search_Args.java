package ch.brix.gql.client.frontify.builders;

public class Account_search_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * How many `AccountSearch` item(s) to show per query. Min: 1, Max: 100.
   * Default value: 25
   */
  public Account_search_Args limit(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("limit", value);
    return this;
  }
  /**
   * Current page number.
   * Default value: 1
   */
  public Account_search_Args page(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("page", value);
    return this;
  }
  /**
   * Define search criteria for the `AccountSearch` item(s).
   * Default value: null
   */
  public Account_search_Args query(ch.brix.gql.client.frontify.input_objects.AccountQueryInput value) {
    _add_arg("query", value);
    return this;
  }
}
