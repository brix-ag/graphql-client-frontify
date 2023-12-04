package ch.brix.gql.client.frontify.builders;

public class RootQuery_workspaceProject_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * `Workspace` Id.
   * Default value: null
   */
  public RootQuery_workspaceProject_Args id(ch.brix.gql.client.frontify.scalars.IdScalar value) {
    _add_arg("id", value);
    return this;
  }
}
