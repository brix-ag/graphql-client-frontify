package ch.brix.gql.client.frontify.builders;

public class RootMutation_removeWorkflowChecklistItem_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * **BETA** `RemoveWorkflowChecklistItem` input argument.
   * Default value: null
   */
  public RootMutation_removeWorkflowChecklistItem_Args input(ch.brix.gql.client.frontify.input_objects.RemoveWorkflowChecklistItemInput value) {
    _add_arg("input", value);
    return this;
  }
}
