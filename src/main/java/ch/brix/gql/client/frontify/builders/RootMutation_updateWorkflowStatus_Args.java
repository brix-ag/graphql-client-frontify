package ch.brix.gql.client.frontify.builders;

public class RootMutation_updateWorkflowStatus_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * **BETA** `UpdateWorkflowStatus` input argument.
   * Default value: null
   */
  public RootMutation_updateWorkflowStatus_Args input(ch.brix.gql.client.frontify.input_objects.UpdateWorkflowStatusInput value) {
    _add_arg("input", value);
    return this;
  }
}
