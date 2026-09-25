package ch.brix.gql.client.frontify.builders;

public class RootMutation_addWorkflowTaskAssignees_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * **BETA** `AddWorkflowTaskAssignees` input argument.
   * Default value: null
   */
  public RootMutation_addWorkflowTaskAssignees_Args input(ch.brix.gql.client.frontify.input_objects.AddWorkflowTaskAssigneesInput value) {
    _add_arg("input", value);
    return this;
  }
}
