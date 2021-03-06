package ai.libs.jaicore.problems.nqueens;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import ai.libs.jaicore.basic.sets.SetUtil;

public class EnumeratingNQueensSolver {
	public Collection<List<Integer>> getSolutions(final NQueensProblem problem) {
		Collection<List<Integer>> solutions = new ArrayList<>();
		Set<Integer> entries = new HashSet<>();
		for (int i = 0; i < problem.getN(); i++) {
			entries.add(i);
		}
		for (List<Integer> positioning : SetUtil.getPermutations(entries)) {
			if (NQueenSolutionChecker.isSolution(positioning)) {
				solutions.add(positioning);
			}
		}
		return solutions;
	}
}
