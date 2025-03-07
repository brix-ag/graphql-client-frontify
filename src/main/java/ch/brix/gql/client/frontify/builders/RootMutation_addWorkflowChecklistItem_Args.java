package ch.brix.gql.client.frontify.builders;

public class RootMutation_addWorkflowChecklistItem_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * **BETA** `AddWorkflowChecklistItem` input argument.
   * Default value: null
   */
  public RootMutation_addWorkflowChecklistItem_Args input(ch.brix.gql.client.frontify.input_objects.AddWorkflowChecklistItemInput value) {
    _add_arg("input", value);
    return this;
  }
}
