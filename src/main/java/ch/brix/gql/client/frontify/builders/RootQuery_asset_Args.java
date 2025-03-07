package ch.brix.gql.client.frontify.builders;

public class RootQuery_asset_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * `Asset` Id.
   * Default value: null
   */
  public RootQuery_asset_Args id(ch.brix.gql.client.frontify.scalars.IdScalar value) {
    _add_arg("id", value);
    return this;
  }
}
