package ch.brix.gql.client.frontify.builders;

public class RootMutation_deleteWorkflowStatus_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * **BETA** `DeleteWorkflowStatus` input argument.
   * Default value: null
   */
  public RootMutation_deleteWorkflowStatus_Args input(ch.brix.gql.client.frontify.input_objects.DeleteWorkflowStatusInput value) {
    _add_arg("input", value);
    return this;
  }
}
