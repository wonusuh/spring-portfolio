package org.suh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.suh.domain.UnitConverterVO;
import org.suh.service.UnitConverterService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/board/*")
@AllArgsConstructor
public class UnitConverterController {
	private UnitConverterService service;

	@GetMapping("/list")
	public void list(Model model) {
		log.info("list");
		model.addAttribute("list", service.getList());
	}

	@PostMapping("/register")
	public String register(UnitConverterVO board, RedirectAttributes rttr) {
		log.info("register : " + board);
		service.register(board);
		rttr.addFlashAttribute("result", board.getBno());
		return "redirect:/board/list";
	}

	@GetMapping("/get")
	public void get(@RequestParam("bno") int bno, Model model) {
		log.info("/get");
		model.addAttribute("board", service.get(bno));
	}

	@GetMapping("/register")
	public void register() {
	}

	@PostMapping
	public String remove(@RequestParam("bno") int bno, RedirectAttributes rttr) {
		log.info("remove.........." + bno);
		if (service.remove(bno)) {
			rttr.addFlashAttribute("result", "success");
		}
		return "redirect:/board/list";
	}
}
