package ch.brix.gql.client.frontify.builders;

public class RootMutation_createWorkflowStatus_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * **BETA** `CreateWorkflowStatus` input argument.
   * Default value: null
   */
  public RootMutation_createWorkflowStatus_Args input(ch.brix.gql.client.frontify.input_objects.CreateWorkflowStatusInput value) {
    _add_arg("input", value);
    return this;
  }
}
