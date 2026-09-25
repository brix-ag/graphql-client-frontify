package ch.brix.gql.client.frontify.builders;

public class RootQuery_serviceApps_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * **BETA**
   * Default value: 25
   */
  public RootQuery_serviceApps_Args limit(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("limit", value);
    return this;
  }
  /**
   * **BETA**
   * Default value: 1
   */
  public RootQuery_serviceApps_Args page(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("page", value);
    return this;
  }
}
