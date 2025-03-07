package ch.brix.gql.client.frontify.builders;

public class RootMutation_createWorkspaceProject_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * `CreateWorkspaceProject` input argument.
   * Default value: null
   */
  public RootMutation_createWorkspaceProject_Args input(ch.brix.gql.client.frontify.input_objects.CreateWorkspaceProjectInput value) {
    _add_arg("input", value);
    return this;
  }
}
