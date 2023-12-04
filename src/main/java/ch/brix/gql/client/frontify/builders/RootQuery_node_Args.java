package ch.brix.gql.client.frontify.builders;

public class RootQuery_node_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * `Node` Id.
   * Default value: null
   */
  public RootQuery_node_Args id(ch.brix.gql.client.frontify.scalars.IdScalar value) {
    _add_arg("id", value);
    return this;
  }
}
