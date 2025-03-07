package ch.brix.gql.client.frontify.builders;

public class RootQuery_creativeExport_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * **BETA** `CreativeJob` Id.
   * Default value: null
   */
  public RootQuery_creativeExport_Args id(ch.brix.gql.client.frontify.scalars.IdScalar value) {
    _add_arg("id", value);
    return this;
  }
}
