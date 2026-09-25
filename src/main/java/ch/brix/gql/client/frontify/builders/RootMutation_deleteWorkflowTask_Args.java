package ch.brix.gql.client.frontify.builders;

public class RootMutation_deleteWorkflowTask_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * **BETA** `DeleteWorkflowTask` input argument.
   * Default value: null
   */
  public RootMutation_deleteWorkflowTask_Args input(ch.brix.gql.client.frontify.input_objects.DeleteWorkflowTaskInput value) {
    _add_arg("input", value);
    return this;
  }
}
