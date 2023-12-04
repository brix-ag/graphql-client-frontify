package ch.brix.gql.client.frontify.builders;

public class RootQuery_assets_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * `Asset` Ids.
   * Default value: null
   */
  public RootQuery_assets_Args ids(java.util.List<ch.brix.gql.client.frontify.scalars.IdScalar> value) {
    _add_arg("ids", value);
    return this;
  }
}
