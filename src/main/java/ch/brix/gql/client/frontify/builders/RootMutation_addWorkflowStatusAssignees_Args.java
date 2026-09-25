package ch.brix.gql.client.frontify.builders;

public class RootMutation_addWorkflowStatusAssignees_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * **BETA** `AddWorkflowStatusAssignees` input argument.
   * Default value: null
   */
  public RootMutation_addWorkflowStatusAssignees_Args input(ch.brix.gql.client.frontify.input_objects.AddWorkflowStatusAssigneesInput value) {
    _add_arg("input", value);
    return this;
  }
}
