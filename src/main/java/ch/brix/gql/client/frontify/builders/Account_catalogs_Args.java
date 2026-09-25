package ch.brix.gql.client.frontify.builders;

public class Account_catalogs_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * **BETA** Number of items to return per page.
   * Default value: 25
   */
  public Account_catalogs_Args limit(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("limit", value);
    return this;
  }
  /**
   * **BETA** Page number to return.
   * Default value: 1
   */
  public Account_catalogs_Args page(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("page", value);
    return this;
  }
}
